package org.example.bean;

public class CommonResp<T> {

    public Integer result;

    public T data;

    public boolean isSuccess(){
        return 100 == result;
    }
}
