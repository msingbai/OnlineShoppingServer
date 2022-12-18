package team.jfshop.jinfengshopserver.wxpay;


import java.io.InputStream;

public interface WXPayConfig {
    String getAppID();

    String getMchID();

    String getKey();

    InputStream getCertStream();

    int getHttpConnectTimeoutMs();

    int getHttpReadTimeoutMs();
}