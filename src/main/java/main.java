import models.MediaList;
import models.MediaMenger;
import networking.ApiResult;
import networking.Util;

public class main {

    public static void main(String[] args) {
        MediaMenger m = new MediaMenger();

        ApiResult result = new ApiResult<MediaList, Exception>() {
            @Override
            public void onResult(MediaList data, Exception exception) {
                if (data != null)
                    System.out.println(data.toString());
                else
                    System.out.println(exception.getMessage());
            }


        };
        //m.getMovie(Util.MOVIES_POPULAR_CODE , result);

        m.getMovie(Util.MOVIES_GENRES_CODE , result);


    }
}
