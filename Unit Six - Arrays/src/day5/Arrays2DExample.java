package day5;

public class Arrays2DExample {
    public static void main(String[] args) {
        int[][] nums = new int[3][3];
        populateArray(nums);
        print2DArray(nums);

        // int[] sumRows = sumEachRow(nums);
        // for (int i : sumRows) {
        //     System.out.println(i);
        // }
        int[] sumCols = sumEachCol(nums);
        for (int i : sumCols) {
            System.out.println(i);
        }
    }

    private static void populateArray(int[][] nums){
        for (int row = 0; row < nums.length; row++){
            for (int col = 0; col < nums[row].length; col++){
                nums[row][col] = (int)(Math.random() * 10);
            }
        }
    }

    private static void print2DArray(int[][] nums){
        for (int[] row : nums) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static int[] sumEachRow(int[][] nums){
        int[] result = new int[nums.length];
        for (int row = 0; row < nums.length; row++) {
            for (int num : nums[row]) {
                result[row] += num;
            }
        }
        return result;
    }

    private static int sumCol(int[][] nums, int col){
        int result = 0;
        for (int[] row : nums) {
            result += row[col];
        }
        return result;
    }

    private static int[] sumEachCol(int[][] nums){
        int[] result = new int[nums[0].length];
        for (int col = 0; col < result.length; col++) {
            result[col] = sumCol(nums, col);
        }
        return result;
    }


}
