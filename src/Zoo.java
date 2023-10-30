package tn.esprit.gestionzoo.entities;
public class Zoo {
    private static final int MAX_CAGES = 25;
    private final Animal[] animals;
    private final String name;
    private final String city;
    private int numberOfAnimals;
    private Aquatic[] aquaticAnimals;
    private int numberOfAquaticAnimals;

    public Zoo(String name, String city, int initialCapacity) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[initialCapacity];
        this.numberOfAnimals = 0;
        aquaticAnimals = new Aquatic[10];
        numberOfAquaticAnimals = 0;
    }
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0.0f;
        for (int i = 0; i < numberOfAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }
    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;
        for (int i = 0; i < numberOfAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++;
            }
        }
        System.out.println("Number of Dolphins: " + dolphinCount);
        System.out.println("Number of Penguins: " + penguinCount);
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

    }
    public void makeAquaticAnimalsSwim() {
        for (int i = 0; i < numberOfAquaticAnimals; i++) {
            aquaticAnimals[i].swim();
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

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            return false;
        }
        int index = searchAnimal(animal);
        if (index == -1) {
            if (numberOfAnimals < animals.length) {
                animals[numberOfAnimals] = animal;
                numberOfAnimals++;
                return true;
            }
        }
        return false;
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
