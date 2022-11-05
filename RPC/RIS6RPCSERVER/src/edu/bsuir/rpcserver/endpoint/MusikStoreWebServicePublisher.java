package edu.bsuir.rpcserver.endpoint;

import edu.bsuir.rpcserver.MusikStoreWebServiceImpl;
import javax.xml.ws.Endpoint;

public class MusikStoreWebServicePublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:1986/rpcserver/musikstore", new MusikStoreWebServiceImpl()); //дописать к адресу
        //?wsdl чтобы просмотреть информацию об этом сервисе
    }
}
