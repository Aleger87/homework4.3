package Animals;

public class Flying extends Birds{
    private String typeMovement;

    public Flying(String name, int year, String habitat, String typeMovement) {
        super(name, year, habitat);
        this.typeMovement = typeMovement;
    }

    public void fly() {

    }

    public String getTypeMovement() {
        return typeMovement;
    }


    @Override
    public String toString() {
        return "Flying{" +
                "typeMovement='" + typeMovement + '\'' +
                '}';
    }
}
