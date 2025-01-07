package day4;

public class ExampleOne {
    public static void main(String[] args) {
        int start = 5;
        int end = 150000000;
        long sum = 0;
        while (start<=end){
            sum += start;
            start++;
        }
        System.out.println(sum);
    }
}
