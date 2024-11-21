package day3;

public class NestedForLoops {
    public static void main(String[] args) {
        createBox(3, 8);
        System.out.println();
        createTriangle(4);
        createBackwardsTriangle(4);
        System.out.println();
        createEmptyBox(5, 3);
    }

    private static void createBox(int height, int width){
        for (int y = 0; y<height; y++){
            for (int x = 0; x<width; x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void createTriangle(int height){
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void createBackwardsTriangle(int height){
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j < height-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void createEmptyBox(int width, int height){
        //top
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();

        //middle
        for (int i = 0; i < height-2; i++) {
            System.out.print("*");
            for (int j = 0; j < width-2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        //bottom
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
