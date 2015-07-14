package com.tw.server;

import javax.naming.NamingException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class MyServer {
    public static void main(String[] args) throws RemoteException, NamingException, MalformedURLException {
        LocateRegistry.createRegistry(30005);
        Naming.rebind("rmi://localhost:30005/Service", new MyServiceImpl());
        System.out.println("Server start...");
    }
}
