package algorithm;

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
}
