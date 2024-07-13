package org.example.processor;

import org.example.bean.Config;
import org.example.util.GlobalConfig;
import org.example.util.GsonUtil;
import org.example.util.LogUtil;

import java.io.File;
import java.io.FileInputStream;

public class ArgsProcessor extends AbsProcessor{
    public static final String TAG = "ArgsProcessor";
    private String[] input;

    public ArgsProcessor(String[] input) {
        this.input = input;
    }

    @Override
    public void handleProcess() {
        String configPath = input[0];
        File file = new File(configPath);
        long fileLength = file.length();
        byte[] content = new byte[(int) fileLength];
        try {
            FileInputStream fis = new FileInputStream(file);
            fis.read(content);
            fis.close();
        } catch (Exception e){
            LogUtil.e(TAG , e.getMessage());
        }
        String configString = new String(content);
        Config config = GsonUtil.convert(configString, Config.class);
        GlobalConfig.init(config.host, config.cookie ,config.qq);
        setNext(new LoginProcessor());
    }
}
