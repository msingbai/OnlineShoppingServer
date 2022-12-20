package team.jfshop.jinfengshopserver.util.wxpay;


import java.io.InputStream;

public interface WXPayConfig {
    String getAppID();

    String getMchID();

    String getKey();

    InputStream getCertStream();

    int getHttpConnectTimeoutMs();

    int getHttpReadTimeoutMs();
}