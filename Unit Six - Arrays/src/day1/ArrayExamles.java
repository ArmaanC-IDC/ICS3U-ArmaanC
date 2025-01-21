package day1;

public class ArrayExamles {
    public static void main(String[] args) {
        // exampleOne();
        // exampleTwo();
        // exampleThree();
        exampleFour();
    }

    private static void exampleOne(){
        int[] nums = {6, 2, 1, -4};
        System.out.println(nums.length);
        
    }

    private static void exampleTwo(){
        double[] values = {3.5, -1.2, 0.3, 5.9, 9.25};
        System.out.println(values[1]);

        for (int i = values.length-1; i > 0; i--) {
            System.out.println(i + " : " + values[i]);
        }
    }

    private static void exampleThree(){
        int[] marks = new int[10];

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        double[] stuff = new double[10];

        for (int i = 0; i < stuff.length; i++) {
            System.out.println(stuff[i]);
        }

        boolean[] moreStuff = new boolean[10];

        for (int i = 0; i < moreStuff.length; i++) {
            System.out.println(moreStuff[i]);
        }

    }

    private static void exampleFour(){
        String[] strings = {"Hello", "Goodbye", "Cya"};

        for (String str : strings) {
            System.out.println(str);
        }

        int[] nums = {3, 1, 7};
        for (int i : nums) {
            i *= 3;
        }
    }
}
