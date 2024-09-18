package day3;

public class ExampleThree {
    public static void main(String[] args){
        int mark1 = 87, mark2=97, mark3=63;
        int numMarks = 3;

        //implicit cast int to double, gain precision (widening conversion)
        double average = (mark1 + mark2 + mark3)/numMarks;

        System.out.println(average);
    }
}