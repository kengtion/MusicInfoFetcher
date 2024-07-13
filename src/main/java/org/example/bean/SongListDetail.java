package org.example.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SongListDetail {

    @SerializedName("disstid")
    public String disstid;
    @SerializedName("dir_show")
    public Integer dirShow;
    @SerializedName("owndir")
    public Integer owndir;
    @SerializedName("dirid")
    public Integer dirid;
    @SerializedName("coveradurl")
    public String coveradurl;
    @SerializedName("dissid")
    public Integer dissid;
    @SerializedName("login")
    public String login;
    @SerializedName("uin")
    public String uin;
    @SerializedName("encrypt_uin")
    public String encryptUin;
    @SerializedName("dissname")
    public String dissname;
    @SerializedName("logo")
    public String logo;
    @SerializedName("pic_mid")
    public String picMid;
    @SerializedName("album_pic_mid")
    public String albumPicMid;
    @SerializedName("pic_dpi")
    public Integer picDpi;
    @SerializedName("isAd")
    public Integer isAd;
    @SerializedName("desc")
    public String desc;
    @SerializedName("ctime")
    public Integer ctime;
    @SerializedName("mtime")
    public Integer mtime;
    @SerializedName("headurl")
    public String headurl;
    @SerializedName("ifpicurl")
    public String ifpicurl;
    @SerializedName("nick")
    public String nick;
    @SerializedName("nickname")
    public String nickname;
    @SerializedName("type")
    public Integer type;
    @SerializedName("singerid")
    public Integer singerid;
    @SerializedName("singermid")
    public String singermid;
    @SerializedName("isvip")
    public Integer isvip;
    @SerializedName("isdj")
    public Integer isdj;
    @SerializedName("tags")
    public List<?> tags;
    @SerializedName("songnum")
    public Integer songnum;
    @SerializedName("songids")
    public String songids;
    @SerializedName("songtypes")
    public String songtypes;
    @SerializedName("disstype")
    public Integer disstype;
    @SerializedName("dir_pic_url2")
    public String dirPicUrl2;
    @SerializedName("song_update_time")
    public Integer songUpdateTime;
    @SerializedName("song_update_num")
    public Integer songUpdateNum;
    @SerializedName("total_song_num")
    public Integer totalSongNum;
    @SerializedName("song_begin")
    public Integer songBegin;
    @SerializedName("cur_song_num")
    public Integer curSongNum;
    @SerializedName("songlist")
    public List<SonglistDTO> songlist;
    @SerializedName("visitnum")
    public Integer visitnum;
    @SerializedName("cmtnum")
    public Integer cmtnum;
    @SerializedName("buynum")
    public Integer buynum;
    @SerializedName("scoreavage")
    public String scoreavage;
    @SerializedName("scoreusercount")
    public Integer scoreusercount;


    public static class SonglistDTO {
        @SerializedName("albumdesc")
        public String albumdesc;
        @SerializedName("albumid")
        public Integer albumid;
        @SerializedName("albummid")
        public String albummid;
        @SerializedName("albumname")
        public String albumname;
        @SerializedName("alertid")
        public Integer alertid;
        @SerializedName("belongCD")
        public Integer belongCD;
        @SerializedName("cdIdx")
        public Integer cdIdx;
        @SerializedName("interval")
        public Integer interval;
        @SerializedName("isonly")
        public Integer isonly;
        @SerializedName("label")
        public String label;
        @SerializedName("msgid")
        public Integer msgid;
        @SerializedName("pay")
        public PayDTO pay;
        @SerializedName("preview")
        public PreviewDTO preview;
        @SerializedName("rate")
        public Integer rate;
        @SerializedName("singer")
        public List<SingerDTO> singer;
        @SerializedName("size128")
        public Integer size128;
        @SerializedName("size320")
        public Integer size320;
        @SerializedName("size5_1")
        public Integer size51;
        @SerializedName("sizeape")
        public Integer sizeape;
        @SerializedName("sizeflac")
        public Integer sizeflac;
        @SerializedName("sizeogg")
        public Integer sizeogg;
        @SerializedName("songid")
        public Integer songid;
        @SerializedName("songmid")
        public String songmid;
        @SerializedName("songname")
        public String songname;
        @SerializedName("songorig")
        public String songorig;
        @SerializedName("songtype")
        public Integer songtype;
        @SerializedName("strMediaMid")
        public String strMediaMid;
        @SerializedName("stream")
        public Integer stream;
        @SerializedName("switch")
        public Integer switchX;
        @SerializedName("type")
        public Integer type;
        @SerializedName("vid")
        public String vid;

        public static class PayDTO {
            @SerializedName("payalbum")
            public Integer payalbum;
            @SerializedName("payalbumprice")
            public Integer payalbumprice;
            @SerializedName("paydownload")
            public Integer paydownload;
            @SerializedName("payinfo")
            public Integer payinfo;
            @SerializedName("payplay")
            public Integer payplay;
            @SerializedName("paytrackmouth")
            public Integer paytrackmouth;
            @SerializedName("paytrackprice")
            public Integer paytrackprice;
            @SerializedName("timefree")
            public Integer timefree;
        }

        public static class PreviewDTO {
            @SerializedName("trybegin")
            public Integer trybegin;
            @SerializedName("tryend")
            public Integer tryend;
            @SerializedName("trysize")
            public Integer trysize;
        }

        public static class SingerDTO {
            @SerializedName("id")
            public Integer id;
            @SerializedName("mid")
            public String mid;
            @SerializedName("name")
            public String name;
        }
    }
}
