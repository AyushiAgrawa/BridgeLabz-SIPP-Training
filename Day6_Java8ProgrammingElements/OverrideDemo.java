package JavaFeature.Day6_Java8ProgrammingElements;

class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof Woof");
    }
}

public class OverrideDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
    }
}

