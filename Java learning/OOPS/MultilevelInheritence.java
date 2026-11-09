public class MultilevelInheritence{
    public static void main(String args[]){
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        IO.println(dobby.legs);
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
    int legs;
}

class Dog extends Mammal{
    String breed;
}