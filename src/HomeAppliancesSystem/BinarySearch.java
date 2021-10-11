/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeAppliancesSystem;

import java.util.LinkedList;

/**
 *
 * @author sun36
 */
public class BinarySearch {
    public static int binarySearch(LinkedList listPrice, int low, int high, int priceSearch) {
        // to find the position of the variable
        if (low <= high) {
            int mid = (low + high) / 2;
            int midValue = Integer.valueOf((String) listPrice.get(mid));
            if (midValue == priceSearch) {
                return mid;
            } else if (midValue < priceSearch) {
                // recursive programming
                return binarySearch(listPrice, mid + 1, high, priceSearch);
            } else {
                // recursive programming 
                return binarySearch(listPrice, low, mid - 1, priceSearch);
            }
        }
        return -1;
    }

    public static void sortPrice(LinkedList listPrice) {
        for (int i = 0; i < listPrice.size() - 1; i++) {
            // to store values for comparison
            int min = minPosition(listPrice, i);
            swap(listPrice, min, i);
        }
    }

    private static int minPosition(LinkedList listPrice, int start) {
        int min = start;
        for (int i = start + 1; i < listPrice.size(); i++) {
            // to determine the smaller and larger value
            int index = Integer.parseInt(listPrice.get(i).toString());
            int mid = Integer.parseInt(listPrice.get(min).toString());
            if (index < mid) {
                min = i;
            }
        }
        return min;
    }

    public static void swap(LinkedList listPrice, int min, int index) {
        // to swap larger value with smaller value
        String tempPrice = (listPrice.get(index).toString());
        listPrice.set(index, listPrice.get(min));
        listPrice.set(min, tempPrice);
    }   

 
}
