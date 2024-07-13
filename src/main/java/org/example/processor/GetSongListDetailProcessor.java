package org.example.processor;

import org.example.MusicApi;
import org.example.bean.CommonResp;
import org.example.bean.SongListDetail;
import org.example.net.NetManager;
import org.example.util.LogUtil;

public class GetSongListDetailProcessor extends AbsProcessor{

    private final long mId;

    public GetSongListDetailProcessor(long mId) {
        this.mId = mId;
    }

    @Override
    protected void handleProcess() {
        MusicApi api = NetManager.INSTANCE.create(MusicApi.class);
        CommonResp<SongListDetail> detail = api.getSongListDetail(mId).blockingFirst();
        if(!detail.isSuccess()){
            throw new IllegalStateException("getUserSongListDetail failed");
        }
        LogUtil.i("getSongListDetail" , "songListCnt = " + detail.data.songlist.size());
        for (SongListDetail.SonglistDTO songlistDTO : detail.data.songlist) {
            StringBuilder singerBuilder = new StringBuilder();
            for (SongListDetail.SonglistDTO.SingerDTO singerDTO : songlistDTO.singer) {
                singerBuilder.append(singerDTO.name).append("\t");
            }
            LogUtil.i("getSongListDetail" , "name = " + songlistDTO.songname + " album = " + songlistDTO.albumname + " singer=" + singerBuilder.toString());
        }

    }
}
