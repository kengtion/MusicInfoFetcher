package org.example;

import io.reactivex.rxjava3.core.Observable;
import org.example.bean.CommonResp;
import org.example.bean.CookieRequestBody;
import org.example.bean.SongListDetail;
import org.example.bean.UserSongList;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface MusicApi {

    @GET("/songlist")
    Observable<CommonResp<SongListDetail>> getSongListDetail(@Query("id") Long songListId);

    @GET("/user/songlist")
    Observable<CommonResp<UserSongList>> getUserSongList(@Query("id") Long qq);

    @POST("/user/setCookie")
    Observable<CommonResp<String>> setCookie(@Body CookieRequestBody body);
}
