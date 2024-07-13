package org.example.util;

import com.google.gson.Gson;

public class GsonUtil {

    private static Gson gson = new Gson();

    public static <T> T convert(String data, Class<T> tClass){
        return gson.fromJson(data, tClass);
    }

}
