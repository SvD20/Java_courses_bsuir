package edu.bsuir;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        String host = (args.length < 1) ? null : args[0];
        try {
            Registry registry = LocateRegistry.getRegistry(host,1087);
            StringProcessing stub = (StringProcessing) registry.lookup("StringProcessing");
            String response = stub.vowelSubstitution("Hello world!");
            System.out.println("response: " + response);
        } catch (Exception e) {
            System.err.println("Client exception: " + e);
            e.printStackTrace();

        }
    }
}
