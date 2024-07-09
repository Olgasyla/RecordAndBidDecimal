public class Main {
    public static void main(String[] args) {

        Owner owner1 = new Owner("Olga", 40, "Osnabrueck");
        Owner owner2 = new Owner("Yvi",45,"Gmhutte");

        Species species = new Species("CatSpecies", 100);
        Animal animal1 = new Animal(2020, "Maniascha", species, 2, owner1);
        Animal animal2 = new Animal(2024, "Paul", species, 5, owner2);

        System.out.println();
        System.out.println(animal1.toString());
        System.out.println(animal2.toString());

//        System.out.println("ID: " + animal2.id());
//        System.out.println("Name: " + animal2.name());
//        System.out.println("Species: " + animal2.species());
//        System.out.println("Age: " + animal2.age());
        System.out.println();
        System.out.println(animal2.equals(animal1));


    }
}



