package ttt;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {

    private static int DEFAULT_PORT = 2048;

    public static void main(String args[]){
        TTT ttt;
        
        try{
            ttt = new TTT();
            
             Registry reg = LocateRegistry.createRegistry(DEFAULT_PORT);
             
             reg.rebind("ttt",ttt);
        }
        catch(RemoteException excep) {
            System.out.println(excep.toString());
            System.exit(-1);
        }
        
       
    
    }
}