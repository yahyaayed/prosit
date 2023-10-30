public class ZooFullException extends Exception {
    public ZooFullException() {
        super("Le zoo est plein. Impossible d'ajouter un nouvel animal.");
    }
}
