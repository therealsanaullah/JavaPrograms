package com.sanaullah.utils;

import java.util.Arrays;


/**
 * @author Sanaullah
 */
public class Utils {
    public static int[] array = {32, 3, 4, 41, 23, 43, 56, 1};
    public static int[] arrayWithDuplicates = {32, 3, 4, 41, 23, 43, 56, 1, 4};

    public static String convertArrayToString(int[] array) {
        return Arrays.toString(array);
    }

    public static void print(String value) {
        System.out.println(value);
    }

}
