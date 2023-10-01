public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;


    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("My Zoo", "Cityville", 25);


        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal giraffe = new Animal("Giraffidae", "Giraffe", 8, false);
        Animal elephant = new Animal("Elephantidae", "Elephant", 12, true);


        boolean addedLion = myZoo.addAnimal(lion);
        boolean addedGiraffe = myZoo.addAnimal(giraffe);
        boolean addedElephant = myZoo.addAnimal(elephant);

        if (addedLion) {
            System.out.println("Lion ajouté avec succès au zoo.");
        } else {
            System.out.println("Impossible d'ajouter le lion au zoo. Le zoo est complet.");
        }

        if (addedGiraffe) {
            System.out.println("Giraffe ajoutée avec succès au zoo.");
        } else {
            System.out.println("Impossible d'ajouter la giraffe au zoo. Le zoo est complet.");
        }

        if (addedElephant) {
            System.out.println("Elephant ajouté avec succès au zoo.");
        } else {
            System.out.println("Impossible d'ajouter l'éléphant au zoo. Le zoo est complet.");
        }
}
}