package ttt;

import org.apache.log4j.Logger;

import java.rmi.Naming;

public class Game {

    private static String remote_location = "rmi://127.0.0.1:2048/ttt";

    private static Logger log = Logger.getLogger(Game.class.getName());
    
    public static void main(String[] args) throws Exception {
        
            TTT ttt;
    	  
            log.info("Starting game...");
    	  
    	    try {
                ttt = (TTT) Naming.lookup(remote_location);
    	    }
    	    catch(Exception excep) {
                System.out.println(excep.toString());
    	    }

            while(true){
                //TODO: Play game
            }
    	  
    }

}
