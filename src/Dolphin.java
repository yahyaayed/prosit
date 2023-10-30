public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public Dolphin() {
        swimmingSpeed = 0.0f;
    }

    public Dolphin(String habitat, float swimmingSpeed) {
        super(habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    // Getter pour swimmingSpeed
    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    // Setter pour swimmingSpeed
    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return "Habitat: " + getHabitat() + "\nSwimming Speed: " + swimmingSpeed;
    }

    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}
