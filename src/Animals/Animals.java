package Animals;

public abstract class Animals {
    private String name;
    private int year;
    private String habitat;

    public Animals(String name, int year, String habitat) {
        this.name = name;
        this.year = year;
        this.habitat = habitat;
    }

    public abstract void eat();
    public abstract void  sleep();
    public abstract void  move ();

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getHabitat() {
        return habitat;
    }

}
