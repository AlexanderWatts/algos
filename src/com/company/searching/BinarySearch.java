package com.company.searching;

public class BinarySearch {

    /**
     * Search a sorted array for a specified value
     * @param array The array we want to search
     * @param value The value we are looking for
     * @return true/false Depending on whether the value
     * is in the array or not
     */
    public boolean search(int[] array, int value) {

        //Set pointers
        int left = 0;
        int right = array.length - 1;

        while(left <= right) {

            //Select mid point
            int mid = (left + right) / 2;

            if(value == array[mid]) {
                return true;
            }

            if(value > array[mid]) {
                left = mid + 1;
            }

            if(value < array[mid]) {
                right = mid - 1;
            }

        }

        return false;

    }

}
