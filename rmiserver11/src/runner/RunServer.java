package runner;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import controller.control;

public class RunServer {
    
  public static void main (String[] argv) {
    try {
		control contr = new control();
			
		Registry registry = LocateRegistry.createRegistry(1199);
			
		registry.bind("rmiTest02", contr);   
        
      System.out.println ("Tovar Server is ready.");
    } catch (Exception e) {
      System.out.println ("Tovar Server failed: " + e);
    }
  }
}
