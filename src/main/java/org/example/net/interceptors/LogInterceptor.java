package org.example.net.interceptors;

import okhttp3.Interceptor;
import okhttp3.OkHttp;
import okhttp3.Request;
import okhttp3.Response;
import org.example.util.LogUtil;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class LogInterceptor implements Interceptor {
    public static final String TAG ="HttpLog";
    @NotNull
    @Override
    public Response intercept(@NotNull Chain chain) throws IOException {
        Request request = chain.request();
        LogUtil.i(TAG, request.toString());
        Response response = null;
        try {
            response = chain.proceed(request);
            LogUtil.i(TAG, response.toString());
        } catch (Exception e){
            LogUtil.e(TAG , e.getMessage());
        }
        return response;
    }
}
