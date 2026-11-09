public class AbstractClasses{
    public static void main(String args[]){
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // IO.println(h.color); //here first the constructor of animal i.e., superclass is called

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();

        Mustang myHorse = new Mustang(); //created a object, so the constructor will be called
        //inheritance ------>    Animal->Horse->Mustang
    }
}

abstract class Animal{
    String color;
    Animal(){
        IO.println("animal constructor called");
    }
    void eat(){
        IO.println("animal eats");
    }

    abstract void walk(); //no implementation written in the abstract class
}

class Horse extends Animal{
    Horse(){
        IO.println("Horse constructor called");
    }
    void changeColor(){
        color = "dark brown";
    }

    void walk(){
        IO.println("walks on four legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        IO.println("Mustang constructor called");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color = "yellow";
    }
    
    void walk(){
        IO.println("walks on 4 legs");
    }
}