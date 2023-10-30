public class Terrestrial {
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
