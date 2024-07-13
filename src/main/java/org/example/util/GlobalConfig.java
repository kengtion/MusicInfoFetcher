package org.example.util;

public class GlobalConfig {

    public final String host;
    public final String cookie;

    public final long qq;

    public GlobalConfig(String host, String cookie , long qq) {
        this.host = host;
        this.cookie = cookie;
        this.qq = qq;
    }


    public static void init(String host , String cookie , long qq) {
        Holder.instance = new GlobalConfig(host , cookie , qq);
    }

    public static GlobalConfig get() {
        return Holder.instance;
    }

    private static class Holder {
        private static GlobalConfig instance = null;
    }
}
