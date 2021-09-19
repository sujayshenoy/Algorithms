package com.yml.algorithms;

import java.util.*;

/**
 * @author Sujay S Shenoy
 * This class demonstrates Bubble Sort
 */
public class BubbleSort {
    private static List<Integer> numbers = new ArrayList<Integer>();

    /**
     * Main function to demonstrate bubble sort
     */
    public static void run() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in the list ");
        int n = in.nextInt();
        System.out.println("Enter the elements of the list to be sorted");
        for (int i = 0; i < n; i++) {
            numbers.add(in.nextInt());
        }
        System.out.println("Before sorting");
        printList();
        bubbleSort();
        System.out.println("\nAfter sorting");
        printList();

        in.close();
    }

    /**
     * Method to print the contents of list
     */
    private static void printList() {
        for (int item : numbers) {
            System.out.print(item + " ");
        }
    }
    
    /**
     * Method to bubble sort an array
     */
    private static void bubbleSort(){
		for( int i = 0; i < numbers.size(); i++){
			for( int j = 0 ; j < numbers.size()-i-1; j++){
				if(numbers.get(j).compareTo(numbers.get(j+1))>0){
					int temp = numbers.get(j);
					numbers.set(j, numbers.get(j+1));
					numbers.set(j+1, temp);
				}
			}
		}
	}

}