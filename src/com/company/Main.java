package com.company;

import com.company.searching.BinarySearch;
import com.company.searching.LinearSearch;

public class Main {

    public static void main(String[] args) {

        //Binary search
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.search(new int[]{1,2,5,9,20}, 20));

        //Linear search
        LinearSearch ls = new LinearSearch();
        System.out.println(ls.search(new int[]{1,2,5,9,20}, 1));


    }
}
