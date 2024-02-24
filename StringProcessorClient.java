import java.rmi.*;

public class StringProcessorClient {
    public static void main(String[] args) {
        try {
            // Recherche de l'objet distant dans le registre RMI
            StringProcessor stub = (StringProcessor) Naming.lookup("rmi://localhost/StringProcessor");

            // Appel de la méthode à distance et récupération du résultat
            String result = stub.processString("Hello World!");

            // Affichage du résultat
            System.out.println("Résultat: " + result);
        } catch (Exception e) {
            // Capture et affichage des exceptions
            System.out.println("Erreur: " + e);
        }
    }
}
