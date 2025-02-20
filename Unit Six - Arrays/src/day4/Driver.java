package day4;

public class Driver {
    public static void main(String[] args) {
        Candy[][] box = {{null, new Candy("lime"), null},
            {null, new Candy("orange"), null},
            {null,null, new Candy("cherry")},
            {null, new Candy("lemon"), new Candy("grape")}};
        BoxOfCandy boxOfCandy= new BoxOfCandy(box);

        System.out.println(boxOfCandy.moveCandyToFirstRow(2));
        // System.out.println(boxOfCandy.removeNextByFlavor("lemon"));
        for (Candy[] row : box) {
            for (Candy candy : row) {
                System.out.print(candy + " - ");
            }
            System.out.println();
        }
    }
}
