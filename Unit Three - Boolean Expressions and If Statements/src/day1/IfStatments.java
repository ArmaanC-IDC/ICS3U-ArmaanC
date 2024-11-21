package day1;

public class IfStatments {
    public static void main(String[] args) {
        boolean hasRedShoes = false;
        if (hasRedShoes){
            System.out.println("hasRedShoes is true");
        }
        if (!hasRedShoes){
            System.out.println("hasRedShoes is false");
        }

        int num = 5;
        if (num % 2 == 0)
            System.out.println("even");
        if (num % 2 != 0)
            System.out.println("odd");
        
        if (num>10) //hello is part of the if, hihi is not
            System.out.println("hello");
            System.out.println("hihi");
    }
}
