public class InvalidAgeException extends Exception {
    public InvalidAgeException() {
        super("L'âge de l'animal ne peut pas être négatif.");
    }
}