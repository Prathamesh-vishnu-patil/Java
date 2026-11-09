public class MethOverloading{
    public static void main(String args[]){
        Calculator calc = new Calculator();
        IO.println(calc.sum(1,2));
        IO.println(calc.sum((float)5.3,(float)2.4));
        IO.println(calc.sum(1,2,4));

    }
}

class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }
}