package day4;

public class Wrapper {
    public static void main(String[] args) {
        // Integer int1 = new Integer(7);
        // System.out.println(int1.intValue);
        //still works, but not a great way to do it. Better way below

        Integer int2 = 8; //took the primitive 8 and wraped it in an intager
        //auto-boxing

        System.out.println(int2); //auto unboxing
        //this is better because you can use it almost like a primitive
        //wrap/unwrap a box - java does it for you. Store a primitive into an object type, or vice versa

        System.out.println(Integer.MAX_VALUE); //prints the biggest number an int can hold (2147483647, don't need to know it)
        System.out.println(Integer.MIN_VALUE); //prints the smallest number an int can hold (-2147483648, don't need to know it)
        //neg is one more than the pos, because 0 is considered a pos number

        Double double1 = 5.5; //capital d for object type, same other stuff as int. No MAX_VALUE, or MIN_VALUE
        System.out.println(double1);
    }
}
