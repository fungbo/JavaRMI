package com.tw.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyService extends Remote {
    String getName() throws RemoteException;
}
