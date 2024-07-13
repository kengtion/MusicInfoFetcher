package org.example.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class UserSongList {


    @SerializedName("list")
    public List<ListDTO> list;
    @SerializedName("creator")
    public CreatorDTO creator;


    public static class CreatorDTO {
        @SerializedName("hostuin")
        public String hostuin;
        @SerializedName("encrypt_uin")
        public String encryptUin;
        @SerializedName("hostname")
        public String hostname;
    }


    public static class ListDTO {
        @SerializedName("diss_name")
        public String dissName;
        @SerializedName("diss_cover")
        public String dissCover;
        @SerializedName("song_cnt")
        public Long songCnt;
        @SerializedName("listen_num")
        public Long listenNum;
        @SerializedName("dirid")
        public Long dirid;
        @SerializedName("tid")
        public Long tid;
        @SerializedName("dir_show")
        public Long dirShow;
    }
}
