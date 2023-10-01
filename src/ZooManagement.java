import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        String zooName = scanner.nextLine();

        int nbrCages = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                System.out.print("Entrez le nombre de cages : ");
                nbrCages = Integer.parseInt(scanner.nextLine());
                isValidInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Veuillez entrer un nombre valide.");
            }
        }

        System.out.println(zooName + " comporte " + nbrCages + " cages");

    }
}



