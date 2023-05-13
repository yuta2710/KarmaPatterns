package org.example;

import org.example.Board.Board;
import org.example.Card.Card;
import org.example.Card.CardServices;
import org.example.Column.ColumnFactory;
import org.example.Column.DoingColumn;
import org.example.Column.DoneColumn;
import org.example.Column.ToDoColumn;

//interface Animal {
//    void makeSound();
//}
//
//class Dog implements Animal {
//    public void makeSound() {
//        System.out.println("Woof!");
//    }
//}
//
//class Cat implements Animal {
//    public void makeSound() {
//        System.out.println("Meow!");
//    }
//}
//
//interface AnimalFactory {
//    Animal createAnimal();
//}
//
//class DogFactory implements AnimalFactory {
//    public Animal createAnimal() {
//        return new Dog();
//    }
//}
//
//class CatFactory implements AnimalFactory {
//    public Animal createAnimal() {
//        return new Cat();
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        AnimalFactory factory = new DogFactory();
//        Animal animal = factory.createAnimal();
//        animal.makeSound();
//    }
//}

interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow!");
    }
}

interface AnimalFactory {
    Animal createAnimal();
}

class DogFactory implements AnimalFactory {
    public Animal createAnimal() {
        return new Dog();
    }
}

class CatFactory implements AnimalFactory {
    public Animal createAnimal() {
        return new Cat();
    }
}

interface AnimalFarm {
    AnimalFactory getAnimalFactory();
}

class PetAnimalFarm implements AnimalFarm {
    public AnimalFactory getAnimalFactory() {
        return new CatFactory();
    }
}

class WildAnimalFarm implements AnimalFarm {
    public AnimalFactory getAnimalFactory() {
        return new DogFactory();
    }
}

public class Main {
    public static void main(String[] args) {
        AnimalFarm farm = new PetAnimalFarm();
        AnimalFactory factory = farm.getAnimalFactory();
        Animal animal = factory.createAnimal();
        animal.makeSound();
    }
}

