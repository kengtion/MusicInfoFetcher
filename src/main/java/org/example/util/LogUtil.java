package org.example.util;

public class LogUtil {

    private static Logger logger = new DefaultLogger();

    public static void d(String tag, String msg){
        logger.d(tag,msg);
    }

    public static void i(String tag, String msg){
        logger.i(tag,msg);
    }

    public static void w(String tag, String msg){
        logger.w(tag,msg);
    }

    public static void e(String tag, String msg){
        logger.e(tag,msg);
    }
}
