package day2;

public class ExampleOne {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = true;

        if (x && y){
            System.out.println("x and y are true");
        }else if (x){
            System.out.println("x is true");
        }else if(y){
            System.out.println("y is true");
        }else{
            System.out.println("both are false");
        }
    }
}
