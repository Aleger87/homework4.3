import Animals.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Object[] arr = new Object[0];

        Herbivorous gazelle = new Herbivorous("Газель", 1, "Лес", 40, "траву");
        gazelle.eat(gazelle.getName(), gazelle.getTypeFood());
        gazelle.sleep(gazelle.getName());
        gazelle.move();

        Herbivorous giraffe = new Herbivorous("Мелман", 5, "Савана", 40, "Листья деревьев");
        giraffe.eat(giraffe.getName(),giraffe.getTypeFood());
        giraffe.sleep(giraffe.getName());
        giraffe.move();

        Herbivorous horse = new Herbivorous("Лошадь", 5, "Домашнее животное", 60, "Сено");
        horse.eat(horse.getName(), horse.getTypeFood());
        horse.sleep(horse.getName());
        horse.move();

        Predators hyena = new Predators("Гиена", 5, "Савана", 30, "Мясо");
        hyena.eat(hyena.getName(),hyena.getTypeFood());
        hyena.sleep(hyena.getName());
        hyena.move();

        Predators tiger = new Predators("Амуский тигр", 3, "Амурская область, Россия", 40, "Мясо");
        tiger.eat(tiger.getName(), tiger.getTypeFood());
        tiger.sleep(tiger.getName());
        tiger.move();



        Predators bear = new Predators("Миша", 7, "Лес", 35, "Мёд");
        bear.eat(bear.getName(), bear.getTypeFood());
        bear.sleep(bear.getName());
        bear.move();

        Amphibians frog = new Amphibians("Квакушка", 1, "Болото");
        frog.eat(frog.getName(), " насекомых");
        frog.sleep(frog.getName());
        frog.move();

        Amphibians grassSnake = new Amphibians("Уж", 1, "Река");
        grassSnake.eat(grassSnake.getName(), " насекомых, мелких животных");
        grassSnake.sleep(grassSnake.getName());
        grassSnake.move();

        NotFlying peacock = new NotFlying("Павлин", 3, "Домашнее животное", null);
        peacock.eat(peacock.getName(), " зерна, крупу");
        peacock.sleep(peacock.getName());
        peacock.move();

        NotFlying penguin = new NotFlying("Ковальски", 12, "Нью-Йорк", null);
        penguin.eat(peacock.getName(), " рыбу");
        penguin.sleep(penguin.getName());
        penguin.move();

        NotFlying dodoBird = new NotFlying("Додо", 3, "Мадагаскар", null);
        dodoBird.eat(dodoBird.getName(), " .. что-то ест..");
        dodoBird.sleep(dodoBird.getName());
        dodoBird.move();

        Flying seagull = new Flying("Чайка", 2, "Море", null);
        seagull.eat(seagull.getName(), " рыбу");
        seagull.sleep(seagull.getName());
        seagull.move();


        Flying albatross = new Flying("Альбатрос", 3, "Море", null);
        albatross.eat(albatross.getName(), " рыбу");
        albatross.sleep(albatross.getName());
        albatross.move();

        Flying falcon = new Flying("Сокол", 3, "Степь", null);
       falcon.eat(falcon.getName() , "мышей");
        falcon.sleep(falcon.getName());
        falcon.move();


    }



    private static void addObject(Object[] arr, Object animal) {
        arr = Arrays.copyOf(arr,  arr.length+1);
        arr[arr.length-1] = animal;
    }


}