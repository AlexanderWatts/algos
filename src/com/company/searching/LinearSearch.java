package com.company.searching;

public class LinearSearch {

    /**
     * Search a sorted array for a specified value
     * @param array The array we want to search
     * @param value The value we are looking for
     * @return true/false Depending on whether the value
     * is in the array or not
     */
    public boolean search(int[] array, int value) {

        for(int i = 0; i < array.length; i++) {

            if(value == array[i]) {
                return true;
            }

        }

        return false;

    }

}
