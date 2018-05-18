package algorithm;

/**
 *
 * @author mhops
 */
public class Sort 
{
    static void bubbleSort(int[] data)
    {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                int left = data[j];
                int right = data[j+1];
                if (left > right) {
                    int temp = left;
                    left = right;
                    right = temp;
                }
            }
        }
    }
}
