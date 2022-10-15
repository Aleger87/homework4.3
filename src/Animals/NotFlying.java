package Animals;

public class NotFlying extends Birds {
    private String typeMovement;

    public NotFlying(String name, int year, String habitat, String typeMovement) {
        super(name, year, habitat);
        this.typeMovement = typeMovement;
    }

    public void walk() {
    }

    public String getTypeMovement() {
        return typeMovement;
    }

    @Override
    public String toString() {
        return "NotFlying{" +
                "typeMovement='" + typeMovement + '\'' +
                '}';
    }
}
