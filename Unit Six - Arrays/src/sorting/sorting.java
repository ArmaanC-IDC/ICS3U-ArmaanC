package sorting;

public class sorting {
    public static void main(String[] args) {
        int[] array = {37, 12, 9, 84, 56, 2, 73, 91, 34, 48};

        // selectionSort(array);
        // insertionSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }    

    private static void selectionSort(int[] array){
        int sortedSectionLength = 0;
        while (sortedSectionLength<array.length-1){
            int smallestIndex = sortedSectionLength + 1;
            for (int i = sortedSectionLength; i < array.length; i++) {
                if (array[i]<array[smallestIndex]){
                    smallestIndex = i;
                }
            }

            int smallestNum = array[smallestIndex];
            array[smallestIndex] = array[sortedSectionLength];
            array[sortedSectionLength] = smallestNum;
            sortedSectionLength++;
        }
    }

    private static void insertionSort(int[] array){
        int sortedSectionLength = 1;
        while (sortedSectionLength<array.length){
            int currentNum = array[sortedSectionLength];

            int i;
            for (i = sortedSectionLength-1; i >= 0 && array[i]>currentNum; i--) {
                array[i+1] = array[i];
            }
            array[i+1] = currentNum;
            sortedSectionLength++;
        }
    }    
}
