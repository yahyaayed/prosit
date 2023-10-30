import java.util.Scanner;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Terrestrial;

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


        System.out.println(zooName + " comporte " + nbrCages + " cages");

    }
    Aquatic aquaticAnimal = new Aquatic("Ocean");
    Dolphin dolphin = new Dolphin("Ocean", 20.0f);
    Penguin penguin = new Penguin("Antarctica", 10.0f);

        System.out.println("Aquatic Animal:\n" + aquaticAnimal);
        System.out.println("\nDolphin:\n" + dolphin);
        System.out.println("\nPenguin:\n" + penguin);
    Zoo myZoo = new Zoo("My Zoo", "Cityville", 25);
        myZoo.displayZoo();
        myZoo.displayAnimals();
    Animal lion = new Animal("Felidae", "Lion", 5, true);
        myZoo.addAnimal(lion);

        if (myZoo.removeAnimal(lion)) {
        System.out.println("Lion supprimé avec succès du zoo.");
    } else {
        System.out.println("Impossible de supprimer le lion du zoo.");
    }
        try {
        myZoo.addAnimal(lion);
        System.out.println("Lion ajouté avec succès au zoo.");
    } catch (ZooFullException e) {
        System.out.println(e.getMessage());
    }
        Aquatic dolphin = new Aquatic();
        Terrestrial lion = new Terrestrial();

        Food meat = Food.MEAT;
        Food plant = Food.PLANT;
        Food both = Food.BOTH;

        dolphin.eatMeat(meat);
        dolphin.eatMeat(plant);
        lion.eatMeat(meat);
        lion.eatMeat(plant);
        lion.eatPlant(plant);
        lion.eatPlant(meat);
        lion.eatPlantAndMeat(both);
    }

}
}



