package Animals;

public abstract class Mammals extends Animals {
    private int speed;
    public Mammals(String name, int year, String habitat, int speed) {
        super(name, year, habitat);
        this.speed = speed;
    }

    public void walk() {

    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void eat(String name, String eat) {
        System.out.println( name + " ест " + eat);
    }

    @Override
    public void sleep(String name) {
        System.out.println(name + " спят по ночам");
    }

    @Override
    public void move() {
        System.out.println("По земле");
    }
}
