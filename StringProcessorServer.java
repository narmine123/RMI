import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.UnicastRemoteObject;

public class StringProcessorServer {
    public static void main(String[] args) {
        try {
            // Création d'une instance de l'implémentation du serveur
            StringProcessorImpl obj = new StringProcessorImpl();

            // Création et démarrage du registre RMI sur le port 1099
            Registry registry = LocateRegistry.createRegistry(1099);

            // Enregistrement de l'objet distant dans le registre sous le nom
            // "StringProcessor"
            registry.rebind("StringProcessor", obj);

            // Affichage d'un message indiquant que le serveur est prêt
            System.out.println("Serveur RMI prêt...");
        } catch (Exception e) {
            // Capture et affichage des exceptions
            System.out.println("Erreur: " + e);
        }
    }
}
