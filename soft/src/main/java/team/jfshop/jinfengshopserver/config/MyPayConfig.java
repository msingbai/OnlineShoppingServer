package team.jfshop.jinfengshopserver.config;

import team.jfshop.jinfengshopserver.util.wxpay.WXPayConfig;

import java.io.InputStream;


public class MyPayConfig implements WXPayConfig {
    @Override
    public String getAppID() {
        return ".....";
    }

    @Override
    public String getMchID() {
        return "1497984412";
    }

    @Override
    public String getKey() {
        return "sbNCm1JnevqI36LrEaxFwcaT0hkGxFnC";
    }

    @Override
    public InputStream getCertStream() {
        return null;
    }

    @Override
    public int getHttpConnectTimeoutMs() {
        return 0;
    }

    @Override
    public int getHttpReadTimeoutMs() {
        return 0;
    }
}

