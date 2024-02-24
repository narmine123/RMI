import java.rmi.*;

// Interface définissant la méthode à exposer via RMI
public interface StringProcessor extends Remote {
    // Méthode qui sera invoquée à distance pour traiter une chaîne
    String processString(String input) throws RemoteException;
}
