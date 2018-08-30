package dsa.algorithm;

/**
 *
 * @author mhops
 */
public class Sort 
{
    /**
     * Bubble sort algorithm
     * This is a O(N^2) algorithm
     * @param data The array to sort
     */
    public static void bubbleSort(int[] data)
    {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j+1]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }
    
    /**
     * Insertion sort algorithm
     * This is an O(n log n) algorithm
     * @param data 
     */
    public static void insetionSort(int[] data) 
    {
        for (int i = 1; i < data.length; i++) {
            int key = data[i];
            int j = i - 1;
            
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;
        }
    }
    
    /**
     * Select sort algorithm
     * This is an O(n^2) algorithm 
     * @param data 
     */
    public static void selectionSort(int[] data) 
    {
        for (int i = 0; i < data.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = data[i];
            data[i] = data[minIndex];
            data[minIndex] = temp;
        }
    }
    
    /**
     * Quick Sort Algorithms
     */
    private static int qsPartition(int arr[], int lowIndex, int highIndex)
    {
        final int pivotValue = arr[highIndex];
        int i = lowIndex - 1;
        for (int j = lowIndex; j <= highIndex - 1; j++) {
            if (arr[j] <= pivotValue) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[highIndex];
        arr[highIndex] = temp;
        return i + 1;
    }

    private static void qs(int arr[], int lowIndex, int highIndex)
    {
        if (lowIndex < highIndex) {
            int pivotIndex = qsPartition(arr, lowIndex, highIndex);
            
            qs(arr, lowIndex, pivotIndex - 1);
            qs(arr, pivotIndex + 1, highIndex);
        }
    }
    
    public static void quickSort(int arr[]) 
    {
        qs(arr, 0, arr.length - 1);
    }
}
