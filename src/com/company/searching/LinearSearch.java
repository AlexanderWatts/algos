package com.company.searching;

public class LinearSearch {

    public boolean search(int[] array, int value) {

        for(int i = 0; i < array.length; i++) {

            if(value == array[i]) {
                return true;
            }

        }

        return false;

    }

}
