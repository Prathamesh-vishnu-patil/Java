public class passArrArg{
    //demo to pass an array as an argument
    //function to update the elements of marks[] array by one
    public static void update(int marks[]){
        for(int i = 0; i<marks.length; i++){
            marks[i]+=1;
        }
    }

    public static void main(String args[]){
        int marks[] = {97, 98, 99};
        update(marks);  //calling the function i.e., call by reference

        //print our marks
        for(int i = 0; i<marks.length; i++){
            System.out.print(  marks[i] + " ");
        }
    }
}