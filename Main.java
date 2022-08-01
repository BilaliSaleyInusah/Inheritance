public class Main {

    public static void main(String[] args) {
        
        Animal animal = new Animal("Animali", 2, 20, 10, 5);
        // System.out.println(animal.getName());

        Dog dog = new Dog("Doggy", 10, 6, 2, 4, 20, 1);
        // System.out.println(dog.getName());

        // animal.eat();
        // dog.eat();
        // dog.move(20);
        // dog.run();
        dog.walk();

    }
}