package Animals;


import java.util.Arrays;

public abstract class Animals {
    private String name;
    private int year;
    private String habitat;
    private  String animal = "Animal";

    public Animals(String name, int year, String habitat) {
        setName(name);
        if (year < 0) {
            this.year = Math.abs(year);
        } else {
            this.year = year;
        }
        setHabitat(habitat);

    }

    public abstract void eat(String name, String eat);

    public abstract void  sleep(String name);

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


    public void setName(String name) {
        if (getName() == animal || getName() == null){
            if (name == null || name.isEmpty() || name.isBlank()) {
                this.name = animal;
            }else{
                this.name = name;
            }
        }
    }




    public void setHabitat(String habitat) {
        if (getHabitat() == null || habitat.isEmpty() || habitat.isBlank()) {
            this.habitat = "Планета Земля";
        } else {
            this.habitat = habitat;
        }

    }

}
