package com.hiold.webservice.server;

import com.hiold.webservice.server.impl.webserviceImpl;

import javax.xml.ws.Endpoint;

public class server {

    public static void main(String[] args) {
        String address = "http://127.0.0.1:8989/hello/he";
        Endpoint.publish(address, new webserviceImpl());
    }

}
