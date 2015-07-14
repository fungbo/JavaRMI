package com.tw.client;

import com.tw.server.MyService;

import javax.naming.NamingException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MyClient {
    private static final String URL = "rmi://localhost:30005/";

    public static void main(String[] args) throws NamingException, RemoteException, MalformedURLException, NotBoundException {
        System.out.println("Client start...");
        MyService service = (MyService) Naming.lookup(URL + "Service");
        System.out.println(service.getName());
    }
}
