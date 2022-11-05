package edu.bsuir;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StringProcessing extends Remote {

    String vowelSubstitution (String startString)throws RemoteException;

}
