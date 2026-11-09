public class Interfaces{
    public static void main(String args[]){
        Queen q = new Queen();
        q.moves();
        Bear br = new Bear();
        br.eatPlants();
        br.eatMeat();
    }
}

interface Herbivore{
    void eatPlants();
}

interface Carnivore{
   void eatMeat(); 
}

class Bear implements Herbivore, Carnivore{ //multiple inhertance
    public void eatPlants(){
        IO.println("Bear eats plants");
    }

    public void eatMeat(){
        IO.println("Bear eats meat");
    }
}

interface ChessPlayer{
    void moves();  //this function is by default abstract and public. We cant write the implementation here
}

class Queen implements ChessPlayer{
    public void moves(){
        IO.println("up, down, left, right, diagonal (in all directions)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        IO.println("up, down, left, right)");
    }
}

class King implements ChessPlayer{
    public void moves(){
        IO.println("up, down, left, right, diagonal (by 1 step)");
    }
}