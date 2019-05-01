package com.company;

import com.company.searching.BinarySearch;
import com.company.searching.LinearSearch;
import com.company.sorting.ReverseArray;

public class Main {

    public static void main(String[] args) {

        //Binary search
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.search(new int[]{1,2,5,9,20}, 20));

        //Linear search
        LinearSearch ls = new LinearSearch();
        System.out.println(ls.search(new int[]{1,2,5,9,20}, 1));

        ReverseArray ra = new ReverseArray();
        ra.sort(new int[]{1,2,5,9,20});


    }
}
