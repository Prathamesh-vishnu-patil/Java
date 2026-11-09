public class Inheritance_demo{
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();
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

//Derived class/subclass
class Fish extends Animal{
    int fins;

    void swim(){
        IO.println("swims in water");
    }
}