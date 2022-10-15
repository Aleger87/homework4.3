package Animals;

public class Flying extends Birds{

    private String typeMovement;

    public Flying(String name, int year, String habitat, boolean hunt, String typeMovement) {
        super(name, year, habitat, hunt);
        this.typeMovement = typeMovement;
    }

    public void fly() {

    }

}
