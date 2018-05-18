package main;

import algorithm.Sort;
/**
 *
 * @author mhops
 */
public class Main 
{
    public static void printArray(int[] arr) 
    {
        for (int val : arr) {
            System.out.println(val);
        }
    }
    
    public static void main(String[] args)
    {
        int[] data = {1, 2, 5, 3, 4, 6, 9, 8, 7};
        Sort.bubbleSort(data);
        
        
        printArray(data);
    }
}
