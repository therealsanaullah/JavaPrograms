package com.sanaullah.arrays;



/**
 * @author Sanaullah
 */
public class SortingArray {

    public int [] sortArrayInAscendingOrder(int [] givenArray){
        for (int i = 0; i < givenArray.length; i++) {
            for (int j = 0; j < givenArray.length; j++) {
                if(givenArray[i] < givenArray[j]){
                    int temp = givenArray[i];
                    givenArray[i] = givenArray[j];
                    givenArray[j] = temp;
                }
            }
        }
        return givenArray;
    }

    public int [] sortArrayInDescendingOrder(int [] givenArray){
        for (int i = 0; i < givenArray.length; i++) {
            for (int j = 0; j < givenArray.length; j++) {
                if(givenArray[i] < givenArray[j]){

                    int temp = givenArray[i];
                    givenArray[i] = givenArray[j];
                    givenArray[j] = temp;
                }
            }
        }
        return givenArray;
    }
}
