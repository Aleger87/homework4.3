package Animals;

public abstract class Birds extends Animals{
    public Birds(String name, int year, String habitat) {
        super(name, year, habitat);
    }

    public void hunting() {

    }

    @Override
    public void eat(String name, String eat) {
        System.out.println(name + "ест " + eat);


    }

    @Override
    public void sleep(String name) {
        System.out.println(name + " практически не спят");
    }

    @Override
    public void move() {
        System.out.println("В воде");
    }
}
