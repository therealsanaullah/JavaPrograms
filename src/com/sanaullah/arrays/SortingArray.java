package com.sanaullah.arrays;


/**
 * @author Sanaullah
 */
public class SortingArray {

    public int[] sortArrayInAscendingOrder(int[] givenArray) {
        for (int i = 0; i < givenArray.length; i++) {
            for (int j = 0; j < givenArray.length; j++) {
                if (givenArray[i] < givenArray[j]) {
                    int temp = givenArray[i];
                    givenArray[i] = givenArray[j];
                    givenArray[j] = temp;
                }
            }
        }
        return givenArray;
    }

    public int[] sortArrayInDescendingOrder(int[] givenArray) {
        for (int i = 0; i < givenArray.length; i++) {
            for (int j = i+1; j < givenArray.length; j++) {
                if (givenArray[i] < givenArray[j]) {

                    int temp = givenArray[i];
                    givenArray[i] = givenArray[j];
                    givenArray[j] = temp;
                }
            }
        }
        return givenArray;
    }

    public int findMissingNumberInArray(int[] givenArray) {
        int missingElement = -1;
        for (int i = 0; i < givenArray.length; i++) {
            if (givenArray[i] != i + 1) {
                missingElement = givenArray[i];
                return missingElement;
            }
        }
        return missingElement;
    }


    public void printRepeating(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[Math.abs(arr[i])] >= 0)
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            else
                System.out.print(Math.abs(arr[i]) + " ");
        }
    }


}
