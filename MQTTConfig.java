package com.mahmoud.mqtt.core;
/**
 * @author Mahmoud Fawzy
 * @since 2020/12/28
 */
import lombok.Getter;
import org.eclipse.paho.mqttv5.common.MqttMessage;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;

@Getter
public abstract class MQTTConfig {

    @Value("${mqtt.brokerURL:127.0.0.1}")
    private String url;

    @Value("${mqtt.port:1883}")
    private int port;

    @Value("${mqtt.username:}")
    private String username;

    @Value("${mqtt.password:}")
    private String password;

    @Value("${mqtt.hasSSL:false}")
    private boolean hasSSl;

    @Value("${mqtt.qos:1}")
    private int qos;

    @Value("${mqtt.clientId:}")
    private String clientId;

    @Value("${mqtt.authMethod:}")
    private String authMethod;

    @Value("${mqtt.authData:}")
    private String authData;

    private String TCP = "tcp://";

    private  String SSL = "ssl://";

    @PostConstruct
    protected abstract void config();

}
