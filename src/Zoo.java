package tn.esprit.gestionzoo.entities;
public class Zoo {
    private static final int MAX_CAGES = 25;
    private final Animal[] animals;
    private final String name;
    private final String city;
    private int numberOfAnimals;

    public Zoo(String name, String city, int initialCapacity) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[initialCapacity];
        this.numberOfAnimals = 0;
    }
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("My Zoo", "Cityville", 25);

        // Affichez les informations du zoo en utilisant la méthode displayZoo()
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

    }
    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + MAX_CAGES);
    }


    public String toString() {
        return "Zoo Name: " + name + "\nCity: " + city + "\nNumber of Cages: " + MAX_CAGES;
    }

    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
        if (animal.getAge() < 0) {
            throw new InvalidAgeException();
        }
        if (numberOfAnimals < 3) {
            animals[numberOfAnimals] = animal;
            numberOfAnimals++;
        } else {
            throw new ZooFullException();
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    public void displayAnimals() {
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println("Animal: " + animal.name);
            }
        }
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index != -1) {
            animals[index] = null;
            return true;
        }
        return false;
    }
    public boolean isZooFull() {
        return animals.length == MAX_CAGES;
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animals.length > z2.animals.length) {
            return z1;
        } else if (z2.animals.length > z1.animals.length) {
            return z2;
        } else {
            return null; // Les zoos ont le même nombre d'animaux
        }
    }
}
