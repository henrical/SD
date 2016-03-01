package ttt;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import org.apache.log4j.Logger;

public class Main {

    private static int DEFAULT_PORT = 2048;

    private static Logger log = Logger.getLogger(Main.class.getName());
    
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
        
        log.info("Server up and running.");
        log.debug("Awaiting communication...");
        
        while(true){
            
        }
        
       
    
    }
}