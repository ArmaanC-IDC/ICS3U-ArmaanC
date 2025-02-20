package day5;

public class Driver {
    public static void main(String[] args) {
        int[][] inputGrid = {{0, 1, 3},
            {1, 4, 2}, 
            {5, 5, 15}};
        Data data = new Data(inputGrid);
        // data.repopulate();

        System.out.println(data.countIncreasingCols());

        int[][] grid = data.getGrid();
        for (int[] row : grid) {
            for (int num : row) {
                System.out.print(num + "");
            }
            System.out.println();
        }
    }
}
