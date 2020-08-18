package com.sanaullah.utils;

import java.util.Arrays;


/**
 * @author Sanaullah
 */
public class Utils {
    public static int[] array = {32, 3, 4, 41, 23, 43, 56, 1};
    public static int[] elementArray = {1,2,3,4,5,6,7,8,9,10,12};
    public static int[] arrayWithDuplicates = {1, 2, 3,  3, 6, 6,1};

    public static String convertArrayToString(int[] array) {
        return Arrays.toString(array);
    }

    public static void print(String value) {
        System.out.println(value);
    }

}
