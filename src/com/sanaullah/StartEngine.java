package com.sanaullah;

import com.sanaullah.arrays.SortingArray;
import com.sanaullah.utils.Utils;
import static com.sanaullah.utils.Utils.convertArrayToString;
import static com.sanaullah.utils.Utils.print;

/**
 * @author Sanaullah
 */
public class StartEngine {

    public static void main(String[] args) {
        runSortingArray();
    }

    private static void runSortingArray() {
        SortingArray sortingArray = new SortingArray();
        print("Array In Ascending Order--->" + convertArrayToString(sortingArray.sortArrayInAscendingOrder(Utils.array)));
        print("Array In Descending Order--->" + convertArrayToString(sortingArray.sortArrayInDescendingOrder(Utils.array)));
    }
}
