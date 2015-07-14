package com.tw.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyServiceImpl implements MyService {

    public MyServiceImpl() throws RemoteException {
        UnicastRemoteObject.exportObject(this, 0);
    }

    @Override
    public String getName() throws RemoteException {
        return getClass().getSimpleName();
    }
}
