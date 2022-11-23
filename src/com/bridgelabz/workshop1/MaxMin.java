package com.bridgelabz.workshop1;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = { 20, 2, 3, 4, 5, 6, 7, 8 };
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (max  < arr[i]) {
                max = arr[i];
            }
            if (min>arr[i]){
                min = arr[i];
        }}
        System.out.println("Largest element is: " + max);
        System.out.println("Smallest element is: " + min);
    }
}
