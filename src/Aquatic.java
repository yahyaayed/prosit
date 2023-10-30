public class Aquatic implements Carnivore<Food> {
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
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println("Aquatic animal is eating meat.");
        } else {
            System.out.println("Aquatic animal cannot eat plant.");
        }
    }
}


}
