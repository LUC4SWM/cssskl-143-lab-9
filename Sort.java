import java.util.Arrays; /**
 * This class implements multiple sort algorithms.
 *
 * @author (your name)
 * @version (CSSSKL 143)
 */

public class Sort {
    public static final int SIZE = 10;

    public static void main(String[] args) {
        int[] bubbleArray = new int[SIZE];
        int[] selectionArray = new int[SIZE];
        int[] insertionArray = new int[SIZE];
        String[] strBubbleArray = new String[SIZE];

        for (int i = 0; i < SIZE; i++) {
            bubbleArray[i] = (int) (Math.random() * 52);
            selectionArray[i] = (int) (Math.random() * 52);
            insertionArray[i] = (int) (Math.random() * 52);
            strBubbleArray[i] =(int) (Math.random() * 52) + "";
        }

//        System.out.println("Array before bubble sort:");
//        System.out.println(Arrays.toString(bubbleArray));
//        bubbleSort(bubbleArray);
//        System.out.println("Array after bubble sort:");
//        System.out.println(Arrays.toString(bubbleArray));
//        System.out.println();


//        System.out.println("Array before selection sort:");
//        System.out.println(Arrays.toString(selectionArray));
//        selectionSort(selectionArray);
//        System.out.println("Array after selection sort:");
//        System.out.println(Arrays.toString(selectionArray));
//        System.out.println();
//
        System.out.println("Array before insertion sort:");
        System.out.println(Arrays.toString(insertionArray));
        insertionSort(insertionArray);
        System.out.println("Array after insertion sort:");
        System.out.println(Arrays.toString(insertionArray));


//        System.out.println("Array before strBubble sort:");
//        System.out.println(Arrays.toString(strBubbleArray));
//        strBubbleSort(strBubbleArray);
//        System.out.println("Array after strBubble sort:");
//        System.out.println(Arrays.toString(strBubbleArray));
//        System.out.println();
    }

    /**
     *
     * @param numbers
     */
    public static void bubbleSort(int[] numbers) {
        // Implement your sort, call a helper swap method
        int len = numbers.length;
        for (int i = 0; i < len - 1; i++){
            for (int j = 0; j < len - i - 1; j++){
                if (numbers[j] > numbers[j+1]){
                    swap(numbers, j,j + 1);
                }
            }
        }
    }

    /**
     *
     *
     * @param numbers
     * @param indexA
     * @param indexB
     */
    public static void swap(int[] numbers, int indexA, int indexB) {
        // swap the elements at indexA and indexB
        int temp = numbers[indexA];
        numbers[indexA] = numbers[indexB];
        numbers[indexB] = temp;
    }

    // bubble sort for strings
    public static void strBubbleSort(String[] strings){
        for (int i = 0; i < strings.length; i++){
            for (int j = strings.length - 1; j > i; j--){
                if (strings[j].compareTo(strings[j-1]) < 0){
                    strSwap(strings,j, j-1);
                }
            }
        }

    }
    // swap method for String bubble sort
    public static void strSwap(String[] strings, int indexA, int indexB) {
        // swap the elements at indexA and indexB
        String temp = strings[indexA];
        strings[indexA] = strings[indexB];
        strings[indexB] = temp;
    }
    // selection sort for ints
    public static void selectionSort(int[] numbers) {
        // Implement your sort, call swapSelection(int[] intList, int i, int nextMin)
        for (int i = 0; i < numbers.length - 1; i++){
            int minIdx = findSmallest(numbers, i, numbers.length);
            swap(numbers, i, minIdx);
        }
    }
    /* While the findSmallest method makes the code cleaner, both versions of the selection sort have O(n^2) time complexity.
    * This is because both have some form of nested loops, the 2nd one just has it running in a helper function.
    * */



    public static int findSmallest(int[] arr, int begin, int end) {
        int minIndex = begin;
        int minValue = arr[begin];
        for (int i = begin + 1; i < end; i++) {
            if (arr[i] < minValue) {
                minIndex = i;
                minValue = arr[i];
            }
        }
        return minIndex;
    }

    /**
     *
     * @param numbers
     */
    public static void insertionSort(int[] numbers) {
        // Implement your insertion sort
        for (int j = 0; j < numbers.length; j++){
            int key = numbers[j];
            int i = j - 1;
            while (i >= 0 && numbers[i] > key){
                numbers[i + 1] = numbers[i];
                i--;
            }
            numbers[i + 1] = key;
        }
    }
}
