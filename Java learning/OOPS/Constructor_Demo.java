public class Constructor_Demo{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Yuvraj";
        s1.roll = 456;
        s1.password = "abcd";

        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;

        Student s2 = new Student(s1); //copy
        s2.password = "xyz";
        s1.marks[2]=100;
        for(int i = 0; i<3; i++){
            IO.println(s2.marks[i]);
        }
        // Student s2 = new Student("Prathamesh");
        Student s3 = new Student(5);
        // IO.println(s1.name);

        
    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];

    // shallow copy constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    //deep copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i = 0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }
    //constructor and its types
    Student(){ //non-parameterized constructor
        marks = new int[3];
        IO.println("Constructor is called");
    }

    Student(String name){ //parametrized constructor
        marks = new int[3];
        this.name = name;
        IO.println("the name of student is : " + name);
    }

    Student(int roll){  //parametrized constructor
        marks = new int[3];
        this.roll = roll;
        IO.println("the roll number of student is : " + roll);
    }
}