package main;

import algorithm.Sort;
import algorithm.Search;
import datastructures.LinkedList;
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
        LinkedList<Integer> myList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }
        
        System.out.println();
        myList.erase(1);
        System.out.println("sise " + myList.size());
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("List at " + i + ": " + myList.get(i));
        }
    }
}
