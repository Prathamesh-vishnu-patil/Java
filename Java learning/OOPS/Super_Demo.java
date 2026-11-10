public class Super_Demo{
    public static void main(String args[]){
        Horse h = new Horse();
        IO.println(h.color); 
    }
}

class Animal{
    String color;
    Animal(){
        IO.println("animal constructor is called");
    }
}

class Horse extends Animal{
    Horse(){
        // super(); //here calling the annimal class constructor
        super.color="brown";
        IO.println("Horse constructor is called");
    }
}