public class Terrestrial implements Omnivore<Food> {
    private int nbrLegs;

    public Terrestrial() {
        nbrLegs = 4;
    }

    public Terrestrial(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    // Getter pour nbrLegs
    public int getNbrLegs() {
        return nbrLegs;
    }

    // Setter pour nbrLegs
    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return "Number of Legs: " + nbrLegs;
    }
}
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println("Terrestrial animal is eating meat.");
        } else {
            System.out.println("Terrestrial animal cannot eat plant.");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println("Terrestrial animal is eating plant.");
        } else {
            System.out.println("Terrestrial animal cannot eat meat.");
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println("Terrestrial animal is eating both plant and meat.");
        } else {
            System.out.println("Terrestrial animal cannot eat both plant and meat.");
        }
    }




