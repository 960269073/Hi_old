package com.hiold.webservice.server.impl;

import com.hiold.webservice.server.Iwebservice;

import javax.jws.WebService;

@WebService
public class webserviceImpl implements Iwebservice {
    @Override
    public String getHello(String str) {
        System.out.println(str);
        return "hello " + str;
    }
}
