package com.yml.algorithms;

import java.io.*;
import java.util.*;

public class BinarySearch {
    private static String words[];

    public static void run() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        readFromFile();
        sort();
        System.out.println("Enter the word to be searched");
        String inpuString = scanner.nextLine();
        scanner.close();
        boolean isFound = binarySearch(inpuString);
        if (isFound) {
            System.err.println("Given word '" + inpuString + "' is found in the file");
        } else {
            System.out.println("Given word '" + inpuString + "' is not found in the file");
        }
    }
    
    public static void readFromFile() throws FileNotFoundException {
        File file = new File("data/words.txt");
        Scanner in = new Scanner(file);
        String wordString = "";
        while (in.hasNext()) {
            wordString = wordString + in.next();
        }
        words = wordString.split(",");

        System.out.println("Array of words from the file are :");
        printArray();
    }
    
    public static void sort() {
        int size = words.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (words[j].compareTo(words[j + 1]) > 0) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
        System.err.println("After sorting : ");
        printArray();
    }
    
    public static void printArray() {
        for (String word : words) {
            System.out.println(word);
        }
    }
    
    public static boolean binarySearch(String word){
        int low = 0;
        int high = words.length-1;
        int middle = ( low + high ) / 2;
        while(low <= high){
            middle = ( low + high) / 2;
            if(words[middle].compareTo(word) == 0){
                return true;
            }else if(words[middle].compareTo(word) < 0){
                low = middle + 1;
            }else{
                high = middle - 1;
            }
        }
        return false;
    }
}
