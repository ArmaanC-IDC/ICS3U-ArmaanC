package day5;

public class Data {
    int[][] grid;
    public static final int MAX = 1500;

    public Data(int[][] grid){
        this.grid = grid;
    }

    public int[][] getGrid(){
        return grid;
    }

    public void repopulate(){
        for (int i = 0; i<grid.length; i++){
            for (int j = 0; j<grid[0].length; j++){
                int num = 100;
                while (num%100 == 0 || num>MAX){
                    num = ((int)(Math.random() * (MAX/10)) + 1) * 10;
                }
                grid[i][j] = num;
            }
        }
    }

    public int countIncreasingCols(){
        int count = 0;
        for (int i = 0; i<grid[0].length; i++){
            boolean isIncreasing = true;
            for (int j = 1; j<grid.length; j++){
                if (grid[j][i]<grid[j-1][i]){
                    isIncreasing = false;
                }
            }
            if (isIncreasing){
                count++;
            }
        }
        return count;
    }


    
}
