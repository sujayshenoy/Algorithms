package com.yml.algorithms;

/**
 * @author Sujay Shenoy
 * This class prints all the prime numbers in the range
 */
public class PrimeNumbers {
    private static int min = 0;
    private static int max = 1000;
    
    public static void run() {
        System.out.println("Prime numbers between the range of " + min + " and " + max + " are:\n");
        primeNumbers();
    }
    
    /**
     * Method to find all the prime numbers in the range
     */
    private static void primeNumbers(){
        if(min < 2 )
            min  = 2;
        
        for(int i = min; i < max; i++){
            boolean prime = true;
            for(int j = 2; j<i/2; j++){
                if(i % j == 0){
                    prime = false;
                    break;
                }
            }
            if(prime){
                System.out.println(i+ " ");
            }
        }

    }
}
