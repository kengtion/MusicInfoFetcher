package org.example.util;

public class DefaultLogger implements Logger{
    private void print(String level , String tag ,String msg){
        String output = level + " : " + " tag:" + tag + "\t" + msg;
        System.out.println(output);
    }

    @Override
    public void d(String tag, String msg) {
        print("Debug" , tag, msg);
    }

    @Override
    public void i(String tag, String msg) {
        print("Info" , tag, msg);
    }

    @Override
    public void w(String tag, String msg) {
        print("Warning" , tag, msg);
    }

    @Override
    public void e(String tag, String msg) {
        print("Error" , tag, msg);
    }
}
