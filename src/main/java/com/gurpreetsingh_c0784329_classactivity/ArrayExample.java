package com.gurpreetsingh_c0784329_classactivity;

import java.util.Arrays;

public class ArrayExample {
    /*
   Declare 10 elements array
       -Display array in reverse order
       -Sort array in ascending order
       -Sort array in descending order
       -Display only Odd Elements
       -Display only Even elements
       -Sum of all elements
    */

    static void reverse(int[] myNum) {
        for (int i = 0; i < myNum.length / 2; i++) {
            int temp = myNum[i];
            myNum[i] = myNum[myNum.length - i - 1];
            myNum[myNum.length - i - 1] = temp;
        }
        System.out.println("Reverse array : " + Arrays.toString(myNum));
    }

    static void ascSort(int[] myNum){
        System.out.print("Ascending Sorted array:");
        for(int i=0; i<myNum.length; i++){
            for(int j =i + 1;j < myNum.length; j++) {
                int temp = 0;
                if (myNum[i] > myNum[j]) {
                    temp = myNum[i];
                    myNum[i] = myNum[j];
                    myNum[j] = temp;
                }
            }
            System.out.print(myNum[i]+ " ");
        }
    }

    static void dscSort(int[] myNum){
        System.out.print("\nDescending Sorted array:");
        for(int i=0; i<myNum.length; i++){
            for(int j =i + 1;j < myNum.length; j++) {
                int temp = 0;
                if (myNum[i] < myNum[j]) {
                    temp = myNum[i];
                    myNum[i] = myNum[j];
                    myNum[j] = temp;
                }
            }
            System.out.print(myNum[i]+ " ");
        }
    }

    static void oddElement(){
        System.out.print("\nOdd Elements in array: ");
        int[] myNum = {20, 11, 32, 21, 4, 43, 34, 7, 65, 43};
        for (int i = 0; i<myNum.length; i++){
            if(myNum[i]%2 != 0){
                System.out.print(myNum[i] + " ");
            }
        }
    }

    static void evenElement(){
        System.out.print("\nEven Elements in array: ");
        int[] myNum = {20, 11, 32, 21, 4, 43, 34, 7, 65, 43};
        for (int i = 0; i<myNum.length; i++){
            if(myNum[i]%2 == 0){
                System.out.print(myNum[i] + " ");
            }
        }
        System.out.print("\n");
    }

    static void sumOfElements(int[] myNum){
        int sum = 0;
        for (int i = 0; i<myNum.length; i++) {
            sum += myNum[i];
        }
        System.out.println("Sum of all elements is: " + sum);
    }

    public static void main(String[] args) {
        int[] myNum = {20, 11, 32, 21, 4, 43, 34, 7, 65, 43};
        reverse(myNum);
        ascSort(myNum);
        dscSort(myNum);
        oddElement();
        evenElement();
        sumOfElements(myNum);
    }
}
