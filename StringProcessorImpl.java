import java.rmi.*;
import java.rmi.server.*;

// Implémentation de l'interface StringProcessor
public class StringProcessorImpl extends UnicastRemoteObject implements StringProcessor {

    // Constructeur par défaut qui peut lever une RemoteException
    public StringProcessorImpl() throws RemoteException {
        super();
    }

    // Implémentation de la méthode de l'interface StringProcessor
    @Override
    public String processString(String input) throws RemoteException {
        // Traitement simple : convertit la chaîne en majuscules
        return input.toUpperCase();
    }
}
