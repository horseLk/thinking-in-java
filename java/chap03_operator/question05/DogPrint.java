package chap03_operator.question05;
class Dog {
    public String name;
    public String says;
}
public class DogPrint {
    public static void main(String[] args) {
        Dog spot = new Dog();
        spot.name = "spot";
        spot.says = "Ruff";
        Dog scruffy = new Dog();
        scruffy.name = "scruffy";
        scruffy.says = "Wurf";
        System.out.println(spot.name + ": " + spot.says);
        System.out.println(scruffy.name + ": " + scruffy.says);

        Dog newDog = spot;
        System.out.println(newDog == spot); // true
        System.out.println(newDog.equals(spot)); // true
    }
}
