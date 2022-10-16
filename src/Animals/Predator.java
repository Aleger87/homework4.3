package Animals;

public class Predator extends Mammal {
    private String typeFood;

    public Predator(String name, int year, String habitat, int speed, String typeFood) {
        super(name, year, habitat, speed);
        this.typeFood = typeFood;
    }

    public void hunting() {
        System.out.println(getName() +" охотятся на других животных");
    }

    public String getTypeFood() {
        return typeFood;
    }

    @Override
    public String toString() {
        return "Predators{" +
                "typeFood='" + typeFood + '\'' +
                '}';
    }
}
