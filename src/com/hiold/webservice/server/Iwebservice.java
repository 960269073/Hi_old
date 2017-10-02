package com.hiold.webservice.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Iwebservice {
    @WebMethod
    public String getHello(String str);
}
