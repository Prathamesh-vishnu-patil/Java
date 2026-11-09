public class MethOverriding{
    public static void main(String args[]){
        Deer d = new Deer();
        d.eat();
    }
}

class Animal{
    void eat(){
        IO.println("eats anything");
    }
}

class Deer extends Animal{
    void eat(){
        IO.println("eats grass");
    }
}