public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal(2020, "Maniascha", "Katze", 2);

        System.out.println(animal1.toString());

        System.out.println("ID: " + animal1.id());
        System.out.println("Name: " + animal1.name());
        System.out.println("Species: " + animal1.species());
        System.out.println("Age: " + animal1.age());

        System.out.println(animal1);
    }
}



