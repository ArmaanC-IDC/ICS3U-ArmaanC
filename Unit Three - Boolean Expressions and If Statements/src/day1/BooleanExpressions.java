package day1;

public class BooleanExpressions {
    public static void main(String[] args) {
        boolean hasRedShoes = true; //booleans hold true/false
        
        // System.out.println(hasRedShoes == false); 

        int age = 23;
        System.out.println(age >= 18);
        //true, because 23 is greater than 18

        /*
         * >= greater than or equal to
         * <= less than or equal to
         * == equal to
         * > greater than
         * < less than
         * != not equal to
         */

         boolean x = age != 18;
         //true. 23 is not equal to 18

         boolean z = !!true; //true. not not true

         boolean a = 7>6; //true
         boolean  b = 3<=2; //false
         boolean c = !a == b; //true. Not true == false, false == false, true.
    }
}
