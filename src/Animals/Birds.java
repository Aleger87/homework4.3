package Animals;

public class Birds extends Animals{
    private boolean hunt;
    public Birds(String name, int year, String habitat, boolean hunt) {
        super(name, year, habitat);
        this.hunt = hunt;
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
