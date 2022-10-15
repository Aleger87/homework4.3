package Animals;

public class Herbivorous extends Mammals{
    private String typeFood;

    public Herbivorous(String name, int year, String habitat, int speed, String typeFood) {
        super(name, year, habitat, speed);
        this.typeFood = typeFood;
    }

    public void graze() {
    }
}
