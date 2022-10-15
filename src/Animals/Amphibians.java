package Animals;

public class Amphibians extends Animals{

    private boolean hunt;

    public Amphibians(String name, int year, String habitat, boolean hunt) {
        super(name, year, habitat);
        this.hunt = hunt;
    }

    public void hunting() {

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
