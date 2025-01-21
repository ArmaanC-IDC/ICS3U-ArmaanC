package day4;

public class Driver {
    public static void main(String[] args) {
        Candy[][] box = {{null, new Candy("chocolate"), new Candy("lemon")},
            {null, null, null},
            {null, new Candy("vanilla"), new Candy("lemon")}};
        BoxOfCandy boxOfCandy= new BoxOfCandy(box);

        System.out.println(boxOfCandy.moveCandyToFirstRow(0));
        for (Candy[] row : box) {
            for (Candy candy : row) {
                System.out.print(candy + " - ");
            }
            System.out.println();
        }
    }
}
