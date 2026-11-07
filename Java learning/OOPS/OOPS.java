public class OOPS{
    public static void main(String args[]){
        Pen p1 = new Pen(); //created a pen object
        p1.setColor("Blue");
        IO.println(p1.color);
        p1.setTip(5);
        IO.println(p1.tip);
    }
}

class Pen{
    //properties + functions
    String color = "red";
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip=newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;  //cgpa

    void calcPercentage(int phy, int chem, int math){
        percentage = (phy+chem+math)/3;
    }
}