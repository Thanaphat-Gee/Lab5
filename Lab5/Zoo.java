import java.util.ArrayList;
public class Zoo {
    public static void main(String[] args) {
        ArrayList<Animal> animal = new ArrayList<>();
        animal.add(new Lion("Zimba"));
        animal.add(new Eagle("Speed"));
        animal.add(new Penguin("Kowalski"));
        animal.add(new Dolphin("P'Smart"));
        System.out.println("^^^ -Animals Names & Sounds- ^^^");
        for (Animal Animal : animal) {
            System.out.println(Animal.getname() + " Say : " + Animal.makeSound());
        }
        System.out.println("^^^ -Animals Abilities- ^^^");
        for (Animal Animal : animal) {
            if (Animal instanceof Flyable) {
                System.out.println(Animal.getname() + " : " + ((Flyable) Animal).fly());
            }
            if (Animal instanceof Swimable) {
                System.out.println(Animal.getname() + " : " + ((Swimable) Animal).swim());
            }
}
}
}