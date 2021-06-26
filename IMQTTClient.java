package com.mahmoud.mqtt.core;

import org.eclipse.paho.mqttv5.common.MqttException;

/**
 * @author Mahmoud Fawzy
 * @date 2021/1/7
 */
public interface IMQTTClient {
    boolean isConnected();

    void disconnect() throws MqttException;
}
