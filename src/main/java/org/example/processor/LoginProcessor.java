package org.example.processor;

import org.example.MusicApi;
import org.example.bean.CommonResp;
import org.example.bean.CookieRequestBody;
import org.example.net.NetManager;
import org.example.util.GlobalConfig;

public class LoginProcessor extends AbsProcessor{


    @Override
    protected void handleProcess() {
        MusicApi api = NetManager.INSTANCE.create(MusicApi.class);
        CookieRequestBody body = new CookieRequestBody();
        body.data = GlobalConfig.get().cookie;
        CommonResp<String> res = api.setCookie(body).blockingFirst();
        if(!res.isSuccess()){
            throw new IllegalStateException("login failed");
        }
        setNext(new GetUserSongListProcessor());
    }
}
