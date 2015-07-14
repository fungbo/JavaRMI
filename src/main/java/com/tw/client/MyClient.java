package com.tw.client;

import com.tw.server.MyService;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.RemoteException;

public class MyClient {
    private static final String URL = "rmi://localhost:30005/";
    private static final Context CONTEXT;

    static {
        try {
            CONTEXT = new InitialContext();
        } catch (NamingException e) {
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) throws NamingException, RemoteException {
        System.out.println("Client start...");
        MyService service = (MyService) CONTEXT.lookup(URL + "Service");
        System.out.println(service.getName());
    }
}
