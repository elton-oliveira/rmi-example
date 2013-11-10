package br.com.fluentcode.rmi.common;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 
 * Remote interface  is the communication protocol between the client and server
 *
 */
public interface Calculator extends Remote{

	int add(int x, int y) throws RemoteException;
}
