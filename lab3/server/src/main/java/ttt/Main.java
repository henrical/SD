package ttt;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {

    public static void main(String args[]){
        TTT ttt;
        
        try{
            ttt = new TTT();
            
             Registry reg = LocateRegistry.createRegistry(119);
        }
        catch(RemoteException excep) {
            System.out.println(excep.toString());
            System.exit(-1);
        }
        
       
    
    }
}