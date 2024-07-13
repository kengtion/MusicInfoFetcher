package org.example.processor;

import org.example.MusicApi;
import org.example.bean.CommonResp;
import org.example.bean.UserSongList;
import org.example.net.NetManager;
import org.example.util.GlobalConfig;
import org.example.util.InputUtil;
import org.example.util.LogUtil;

public class GetUserSongListProcessor extends AbsProcessor{

    @Override
    protected void handleProcess() {
        MusicApi api = NetManager.INSTANCE.create(MusicApi.class);
        CommonResp<UserSongList> data = api.getUserSongList(GlobalConfig.get().qq).blockingFirst();
        if(!data.isSuccess()){
            throw new IllegalStateException("getUserSongList failed");
        }
        LogUtil.i("Main" , "查询到歌单");
        for (UserSongList.ListDTO listDTO : data.data.list) {
            LogUtil.i("Main" , "名称=" + listDTO.dissName + " 数量=" + listDTO.songCnt);
        }
        String input = InputUtil.getInput();
        int index = Integer.valueOf(input);
        UserSongList.ListDTO songList = data.data.list.get(index);
        setNext(new GetSongListDetailProcessor(songList.tid));
    }
}
