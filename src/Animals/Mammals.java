package Animals;

public class Mammals extends Animals {
    private int speed;
    public Mammals(String name, int year, String habitat, int speed) {
        super(name, year, habitat);
        this.speed = speed;
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void move() {

    }
}
