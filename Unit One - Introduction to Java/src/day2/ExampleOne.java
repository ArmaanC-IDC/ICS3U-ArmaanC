package day2;

public class ExampleOne {
    public static void main(String[] args){
        // add the digits from a four digit number
        int num = 1853;
        
        int digit1 = num/1000%10;
        int digit2 = num/100%10;
        int digit3 = num/10%10;
        int digit4 = num/1%10;

        System.out.println(digit1 + digit2 + digit3 + digit4);

    }
}