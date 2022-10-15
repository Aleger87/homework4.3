package Animals;

import java.awt.*;

public class Amphibians extends Animals{

    public Amphibians(String name, int year, String habitat) {
        super(name, year, habitat);
    }

    public void hunting() {

    }

    @Override
    public void eat(String name, String eat) {
        System.out.println(name + " "+eat );
    }

    @Override
    public void sleep(String name) {
        System.out.println(name + " спят зимой");
    }

    @Override
    public void move() {
        System.out.println("По земле и по воде");
    }
}
