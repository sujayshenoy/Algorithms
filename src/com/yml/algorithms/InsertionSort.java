package com.yml.algorithms;

import java.util.*;

/**
 * @author Sujay S Shenoy
 * This class demonstrates the insertion sort
 */
public class InsertionSort {
    private static String[] words;

    /**
     * This is the main fucntion of this class
     */
    public static void run() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of words in the array");
        int n = in.nextInt();
        words = new String[n];
        System.out.println("Enter the words to be sorted");
        for (int i = 0; i < n; i++) {
            words[i] = in.next();
        }
        System.out.println("\nBefore sorting\n");
        printArray();
        insertionSort();
        System.out.println("\nAfter sorting\n");
        printArray();

        in.close();
    }
    
    /**
     * Insertion sort algorithm to sort the array
     */
    private static void insertionSort() {
        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            int j = i - 1;
            while (j >= 0 && words[j].compareTo(word) > 0) {
                words[j + 1] = words[j];
                j = j - 1;
            }
            words[j + 1] = word;
        }
    }

    /**
     * Method to print the contents of array
     */
    private static void printArray(){
		for(String word : words){
			System.out.println(word);
		}
	}
}
