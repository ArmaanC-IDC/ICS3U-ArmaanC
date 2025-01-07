package day4;

public class NestedLoops {
    public static void main(String[] args) {
        drawRectangle(5, 10);
    }

    private static void drawRectangle(int height, int width){
        for (int i = 0; i<=height; i++){
            for(int j = 0; j<=width; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
