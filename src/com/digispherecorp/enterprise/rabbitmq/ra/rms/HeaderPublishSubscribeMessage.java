/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digispherecorp.enterprise.rabbitmq.ra.rms;

/**
 *
 * @author walle
 */
public class HeaderPublishSubscribeMessage implements IPublishSubscribeMessage {

    private final String subscribeType = "header";

    @Override
    public String getSubscribeType() {
        return subscribeType;
    }

}