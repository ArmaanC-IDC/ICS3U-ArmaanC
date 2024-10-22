package day6;

public class ExampleOne {
    public static void main(String[] args) {
        String s1 = new String("Hi");
        String s2 = new String("Hi");
        System.out.println(s1==s2); //false bcs different locations in memory

        System.out.println(s1.equals(s2)); //true bcs they both store "Hi"

        System.out.println("Dev".compareTo("Ian")); //-5
        System.out.println("Louisa".compareTo("Ian"));  //3
        System.out.println("Simon".compareTo("Stefano")); //-11
        System.out.println("Stefano".compareTo("Simon")); //11
        System.out.println("Dog".compareTo("dog")); //-32
        System.out.println("".compareTo("~")); //-1. If one string is longer, it's just -1/+1
        //returns ASKI of this - ASKI of other. Unless chars are equal, then it moves on to next one. 
    }
}
