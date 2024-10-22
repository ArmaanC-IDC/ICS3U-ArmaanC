package day5;

public class StringExamples {
    public static void main(String[] args) {
        System.out.println("Answer is " + 7 + 8); //Answer is 78
        //concatonates 7, then 8
        System.out.println("Answer is " + (7+8)); //Answer is 15

        String message = "AP  COMP  SCI  ROCKS"; //this works without a constructor

        String s1 = "Apple";
        String s2 = "Mango";
        String s3 = "Apple";
        System.out.println(s1);
        System.out.println(s3 == s1);

        String str1 = new String("Apple");
        String str2 = new String("Orange");
        String str3 = new String("Apple");
        System.out.println(str1==str3);

        message = "AP  COMP  SCI  ROCKS"; 
        System.out.println(message.indexOf("SCI")); // returns 10
        System.out.println(message.indexOf("sci")); //returns -1
        System.out.println(message.substring(15)); //returns ROCKS (index 15 to end)
        System.out.println(message.substring(15, 19)); //returns ROCK (15 to 19, not including 19)
    }
}
