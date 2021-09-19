package com.yml.algorithms;

import java.util.*;

/**
 * @author Sujay S Shenoy
 * This class detects Anagrams
 */
public class Anagram {
    private static String string1, string2;

    /**
     * Main function of the class to detect anagrams
     */
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first String:");
        string1 = scanner.nextLine();
        string1.toLowerCase();
        System.out.println("Enter second String:");
        string2 = scanner.nextLine();
        string2.toLowerCase();
        anagram();
        scanner.close();
    }
    
    /**
     * Method to detect anagram
     */
    public static void anagram() {
		int length1 = string1.length();
		int length2 = string2.length();
		int count = 0;
		
		if(length1 != length2) {
			System.out.println("Given words are not anagrams to each other");
			return;
		}
		
		char[] array1 = string1.toCharArray();
		char[] array2 = string2.toCharArray();
		
		for(int i=0 ; i<length1 ; i++) {
			for(int j=0 ; j<length2 ; j++) {
				if(array1[i] == array2[j]) {
					count++;
					array2[j] = ' ';
					break;
				}
			}
		}
		
		if(count == length1) {
			System.out.println("Given words are anagrams to each other");
		}else
			System.out.println("Given words are not anagrams to each other");
	}
}
