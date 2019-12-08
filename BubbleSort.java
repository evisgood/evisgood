package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[]) {
        int[] arrayOfNumbers = {78,-4,4,8,-1,5,-1,121,99};//this is array

        System.out.println("My array contains " + arrayOfNumbers.length + " numbers");
        System.out.println("Which are " + Arrays.toString(arrayOfNumbers));

        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(arrayOfNumbers);//sorting arrayOfNumbers

        System.out.println("In Ascending order Array " + Arrays.toString(arrayOfNumbers));
    }

    public void bubbleSort(int array[]) {
        int size = array.length;
        boolean swapped = false; //boolean for swapped numbers

        for (int i = 0; i < size - 1; i++) { //loop for swapping, size - 1 = 8. while i is less than 8, so we are repeating loop 8 times because int i is starting from 0
            for (int j = 0; j < size - i - 1; j++) { //swapping . j = number of column where is number of array. starting with 0 number = 78, and 1 number = -1.

                if (array[j] > array[j + 1]) { //if left element is greater than next to him element. if 0 (78) position > 0+1 (-4) position
                    int temp = array[j]; // 78 putting into temp
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
    }
}
