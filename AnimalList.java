import java.util.ArrayList;
import java.util.List;

// Base class for all animals
 class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Default sound - can be overridden by specific animals
    public String makeSound() {
        return "makes a sound";
    }
}

// Dog class extends Animal
class Dog extends Animal {
    public Dog(String name) {
        super(name);  // Calls the Animal constructor
    }

    @Override
    public String makeSound() {
        return "says Woof!";
    }
}

// Cat class extends Animal
 class Cat extends Animal {
    public Cat(String name) {
        super(name);  // Calls the Animal constructor
    }

    @Override
    public String makeSound() {
        return "says Meow!";
    }
}

// Main program
public class AnimalList {
    public static void main(String[] args) {
        // Create our animal shelter list
        List<Animal> animalShelter = new ArrayList<>();

        // Add dogs
        animalShelter.add(new Dog("Rollo"));
        animalShelter.add(new Dog("Lisa"));
        animalShelter.add(new Dog("Edward"));

        // Add cats
        animalShelter.add(new Cat("Elsa"));
        animalShelter.add(new Cat("Tuborg"));
        animalShelter.add(new Cat("Lizzie"));

        // Show all animals
        System.out.println("Animals available for adoption:");
        for (Animal animal : animalShelter) {
            System.out.println(animal.getName() + " " + animal.makeSound());
        }
    }
}