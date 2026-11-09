public class HybridInherit{
    public static void main(String args[]){
        Tuna fm = new Tuna();
        fm.swim();
        fm.eat();
    }
}

//base class
class Animal{
    String color;
    void eat(){
        IO.println("eats");
    }

    void breathe(){
        IO.println("breathes");
    }
}

class Fish extends Animal{
    void swim(){
        IO.println("swim");
    }
}

class Bird extends Animal{
    void fly(){
        IO.println("fly");
    }
}

class Mammal extends Animal{
    void walk(){
        IO.println("walks");
    }
}

class Tuna extends Fish{
    void swimFast() {
        IO.println("Tuna swims very fast");
    }
}

class Shark extends Fish{
    void detectPrey() {
        IO.println("Shark detects prey using electrical signals");
    }
}

class Peacock extends Bird{
    void dance() {
        IO.println("Peacock dances by spreading its beautiful feathers");
    }
}

class Dog extends Mammal{
    void bark() {
        IO.println("Dog barks");
    }
}

class Cat extends Mammal{
    void meow() {
        IO.println("Cat meows");
    }
}

class Human extends Mammal{
    void speak() {
        IO.println("Human can speak");
    }
}