package src;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class MediaList {
    @SerializedName("results")
    private ArrayList<Media> allMedia ;

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for(Media m : allMedia)
            sb.append(m.toString());
        return sb.toString();
    }
}
