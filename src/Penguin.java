public class Penguin extends Aquatic {
    private float swimmingDepth;

    public Penguin() {
        swimmingDepth = 0.0f;
    }

    public Penguin(String habitat, float swimmingDepth) {
        super(habitat);
        this.swimmingDepth = swimmingDepth;
    }

    // Getter pour swimmingDepth
    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    // Setter pour swimmingDepth
    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return "Habitat: " + getHabitat() + "\nSwimming Depth: " + swimmingDepth;
    }

    public void swim() {
        System.out.println("This penguin is swimming.");
    }
}