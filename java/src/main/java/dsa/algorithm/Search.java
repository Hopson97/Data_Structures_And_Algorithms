package dsa.algorithm;

/**
 *
 * @author mhops
 */
public class Search 
{
    public static int linearSearch(int arr[], int value) 
    {
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                return i;
            }
        }
        
        return -1;
    }
    
    public static int binarySearch(int arr[], int value)
    {
        int left = 0;
        int right = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (left > right) {
                return -1; //unsucessful
            }

            int middle = (left + right) / 2;
            if (arr[middle] < value) {
                left = middle + 1;
            }
            else if (arr[middle] > value) {
                right = middle - 1;
            }
            else {
                return middle;
            }
        }
        return -1;
    }
}
