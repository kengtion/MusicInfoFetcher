package org.example.net;

import okhttp3.OkHttpClient;
import org.example.net.interceptors.LogInterceptor;
import org.example.util.GlobalConfig;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public enum NetManager {
    INSTANCE;

    private Retrofit retrofit;
    NetManager() {
        if(GlobalConfig.get() == null){
            throw new IllegalStateException("GlobalConfig is null");
        }
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new LogInterceptor())
                .build();
        retrofit = new Retrofit.Builder()
                .baseUrl(GlobalConfig.get().host)
                .client(client)
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public <T> T create(Class<T> api){
        return retrofit.create(api);
    }
}
