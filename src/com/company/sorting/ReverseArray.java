package com.company.sorting;

import java.util.Arrays;

public class ReverseArray {

    private int[] reverseArray;

    /**
     * Reverse an array of integers
     * So [1, 2, 3] becomes [3, 2, 1]
     * @param array The array we want to sort
     */
    public int[] sort(int[] array) {

        reverseArray = array;

        //Set pointers
        int left = 0;
        int right = array.length - 1;

        //As long as left is less than right
        //keep swapping the integers at each index
        while(left < right) {

            //Swap values
            swap(left, right);

            //Move left pointer up
            left++;

            //Move right pointer down
            right--;

        }

        System.out.println(Arrays.toString(reverseArray));
        return reverseArray;

    }

    /**
     * Swap two values in array given the indexs
     * @param left The left pointers index
     * @param right The right pointers index
     */
    public void swap(int left, int right) {

        //Temporarily store the left pointers value
        int temp = reverseArray[left];

        //Overwrite the left pointers value
        reverseArray[left] = reverseArray[right];

        //Set the last pointers value to the left pointers
        reverseArray[right] = temp;
    }

}
