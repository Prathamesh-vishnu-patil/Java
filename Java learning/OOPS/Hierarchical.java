public class Hierarchical{
    public static void main(String args[]){
        Mammal lizard = new Mammal();
        lizard.walk();
        Fish shark = new Fish();
        shark.swim();
        Bird sparrow = new Bird();
        sparrow.fly();
    }
}

//Base/parent class
class Animal{
    String color;
    void eat(){
        IO.println("eats");
    }

    void breathe(){
        IO.println("breathes");
    }
}

class Mammal extends Animal{
    void walk(){
        IO.println("walks");
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