public class Aquatic {
    private String habitat;

    public Aquatic() {
        habitat = "Unknown";
    }

    public Aquatic(String habitat) {
        this.habitat = habitat;
    }

    // Getter pour habitat
    public String getHabitat() {
        return habitat;
    }

    // Setter pour habitat
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Habitat: " + habitat;
    }
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }


    public static void main(String[] args) {
        Aquatic aquaticAnimal = new Aquatic("Ocean");
        Dolphin dolphin = new Dolphin("Ocean", 20.0f);
        Penguin penguin = new Penguin("Antarctica", 10.0f);

        System.out.println("Aquatic Animal:\n" + aquaticAnimal);
        System.out.println("\nDolphin:\n" + dolphin);
        System.out.println("\nPenguin:\n" + penguin);
    }

}
