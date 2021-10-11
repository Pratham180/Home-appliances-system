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
public class Sorting {
    public static void ascending(LinkedList listFilter) {
        for (int i = 5; i < listFilter.size() - 1; i = (i + 6)) {
            // to store value for comparison
            int min = minPosition(listFilter, i, true);
            swap(listFilter, min, i);
        }
    }

    public static void descending(LinkedList listFilter) {
        for (int i = 5; i < listFilter.size() - 1; i = (i + 6)) {
            // to store value for comparison
            int min = minPosition(listFilter, i, false);
            swap(listFilter, min, i);
        }
    }

    public static int minPosition(LinkedList listFilter, int start, boolean asc) {
        int min = start;
        for (int i = start + 6; i < listFilter.size(); i = (i + 6)) {
            // to determine the smaller and larger value
            int index = Integer.parseInt(listFilter.get(i).toString());
            int position = Integer.parseInt(listFilter.get(min).toString());

            // for ascending order
            if (asc == true) {
                if (index < position) {
                    min = i;
                }
                // for descending order
            } else {
                if (index > position) {
                    min = i;
                }
            }
        }
        return min;
    }

    public static void swap(LinkedList listFilter, int minPosition, int index) {
        // to swap larger value with smaller value or vice-versa
        for (int i = 0; i < 6; i++) {
            String temp = (listFilter.get(index - i).toString());
            listFilter.set(index - i, listFilter.get(minPosition - i));
            listFilter.set(minPosition - i, temp);
        }
    }
}
  

