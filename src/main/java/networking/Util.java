package networking;

public class Util {
    public static final String BASE = "https://api.themoviedb.org/3/";
    public static final String urlPopular = "movie/top_rated?api_key=96624ea86553cd7a4caed4ecbdc35ec1" ;
    public static final String urlGenres = "discover/movie?api_key=96624ea86553cd7a4caed4ecbdc35ec1" ;
    public static final String urlNew = "discover/movie?api_key=96624ea86553cd7a4caed4ecbdc35ec1" ;
    public static final String urlSeries = "tv/top_rated?api_key=96624ea86553cd7a4caed4ecbdc35ec1" ;

    public static int MOVIES_POPULAR_CODE = 0;
    public static int MOVIES_NEW_CODE = 1;
    public static int MOVIES_GENRES_CODE = 2;
    public static int MOVIES_SERIES_CODE = 3;


}
