package Animals;

public class Predators extends Mammals{
    private String typeFood;

    public Predators(String name, int year, String habitat, int speed, String typeFood) {
        super(name, year, habitat, speed);
        this.typeFood = typeFood;
    }

    public void hunting() {
    }
}
