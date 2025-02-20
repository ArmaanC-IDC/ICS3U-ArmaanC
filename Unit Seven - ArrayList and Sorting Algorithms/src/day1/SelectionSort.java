package day1;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {37, 12, 9, 84, 56, 2, 73, 91, 34, 48};

        // selectionSort(array);
        insertionSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }    

    private static void insertionSort(int[] array){
        int sortedSectionLength = 1;
        while (sortedSectionLength<array.length){
            int currentNum = array[sortedSectionLength];

            int i;
            for (i = sortedSectionLength-1; i>=0 && array[i] > currentNum; i--) {
                if (array[i]>currentNum){
                    array[i+1] = array[i];
                }
            }
            array[i+1] = currentNum;

            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
            sortedSectionLength++;
        }
    }
    
}
