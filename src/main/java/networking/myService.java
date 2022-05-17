package networking;

import models.MediaList;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface myService {

    @GET(Util.urlPopular)
    Call<MediaList> getMovies();

    @GET(Util.urlGenres)
    Call<MediaList> getPopular();

    @GET(Util.urlNew)
    Call<MediaList> getGenres();

    @GET(Util.urlSeries)
    Call<MediaList> getSeries();


}
