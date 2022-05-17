package models;

import networking.ApiResult;
import networking.Util;
import networking.myService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MediaMenger {

    private final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(Util.BASE)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    private final myService service =  retrofit.create(myService.class);


    public void getMovie(int moviesPopularCode, ApiResult<MediaList, Exception> apiResult) {
        Call<MediaList> call ;

        switch (moviesPopularCode) {
            case 0 : {
                call = service.getMovies();
                break;
            }
            case 1 :{
                call = service.getGenres();
                break;
            }
            case 2 :{
                call = service.getPopular();
                break;
            }
            case 3 :{
                call = service.getSeries();
                break;
            }
            default:
                call = service.getMovies();

        }

        call.enqueue(new Callback<MediaList>() {
            @Override
            public void onResponse(Call<MediaList> call, Response<MediaList> response) {
                apiResult.onResult(response.body() , null);
            }

            @Override
            public void onFailure(Call<MediaList> call, Throwable t) {
                apiResult.onResult(null, new Exception("error") );
            }
        });
    }
}
