package com.sanaullah;

import com.sanaullah.arrays.SortingArray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Initial Main");

        SortingArray sortingArray = new SortingArray();

        int [] array = {32,3,4,41,23,43,56,1};
        System.out.println("Array In Ascending Order--->"+Arrays.toString(sortingArray.sortArrayInAscendingOrder(array)));
        System.out.println("Array In Descending Order--->"+Arrays.toString(sortingArray.sortArrayInDescendingOrder(array)));
    }
}
