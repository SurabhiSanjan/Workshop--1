package com.bridgelabz.workshop1;

public class Duplicate {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 1, 2,3};
        for(int i=0; i<arr.length; i++ ) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i]==arr[j]) {
                    System.out.print(arr[i]+" ");
                    break;
                }
            }
        }  System.out.println("are duplicate elements");
    }
}
