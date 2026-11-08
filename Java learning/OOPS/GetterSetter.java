public class GetterSetter{
    public static void main(String args[]){
        Pen p1 = new Pen(); //created a pen object
        p1.setColor("Blue");
        IO.println(p1.getColor());
        p1.setTip(5);
        IO.println(p1.getTip());
    }
}

class Pen{
    private String color;
    private int tip;

    String getColor(){ //getter
        return this.color;
    }

    int getTip(){ //getter
        return this.tip;
    }

    void setColor(String newColor){ //setter
        this.color = newColor;
    }

    void setTip(int tip){ //setter
        this.tip = tip;
    }
}