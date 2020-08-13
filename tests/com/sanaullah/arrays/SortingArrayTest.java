package com.sanaullah.arrays;

import com.sanaullah.utils.Utils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Sanaullah
 */
public class SortingArrayTest {

    SortingArray obj;

    @Before
    public void setUp() throws Exception {
        obj = new SortingArray();
    }

    @Test
    public void sortArrayInAscendingOrder() {
        int[] outputArray = {1, 3, 4, 23, 32, 41, 43, 56};
        Assert.assertArrayEquals(outputArray, obj.sortArrayInAscendingOrder(Utils.array));
    }

    @Test
    public void sortArrayInDescendingOrder() {

        int[] outputArray = {56, 43, 41, 32, 23, 4, 3, 1};
        Assert.assertArrayEquals(outputArray, obj.sortArrayInDescendingOrder(Utils.array));

    }
}