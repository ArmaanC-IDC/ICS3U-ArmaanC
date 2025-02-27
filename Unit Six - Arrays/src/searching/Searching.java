package searching;

import java.util.Arrays;

public class Searching {
    public static void main(String[] args) {
        int[] arr = new int[25];
        initArray(1, 100, arr);
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(linearSearch(arr, 23));
        System.out.println(binarySearch(arr, 23));
    }

    private static void initArray(int min, int max, int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*(max-min+1)) + min;
        }
    }

    //sometimes called sequential search
    private static int linearSearch(int[] arr, int findMe){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==findMe){
                return i;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] arr, int findMe){
        int minIndex = 0;
        int maxIndex = arr.length-1;
        int middleIndex;
        while (minIndex<=maxIndex){
            middleIndex = (minIndex + maxIndex) / 2;
            if (arr[middleIndex]==findMe){
                return middleIndex;
            }

            if (findMe>arr[middleIndex]){
                minIndex = middleIndex+1;
            } else {
                maxIndex = middleIndex-1;
            }
        }
        return -1;
    }
}
