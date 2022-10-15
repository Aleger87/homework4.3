package Animals;

public class NotFlying extends Birds {
    private String typeMovement;

    public NotFlying(String name, int year, String habitat, boolean hunt, String typeMovement) {
        super(name, year, habitat, hunt);
        this.typeMovement = typeMovement;
    }

    public void walk() {
    }
}
