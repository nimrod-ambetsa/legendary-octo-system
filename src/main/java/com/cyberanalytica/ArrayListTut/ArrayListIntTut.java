package com.cyberanalytica.ArrayListTut;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListIntTut {
    public static void main(String[] args) {
        ArrayList<Integer> newNumbers = new ArrayList<Integer>();

        newNumbers.add(12);
        newNumbers.add(13);
        newNumbers.add(14);
        newNumbers.add(15);
        newNumbers.add(16);
        newNumbers.add(17);

        for (Integer number : newNumbers){
            System.out.println(number);
        }

        Collections.sort(newNumbers);

        System.out.println("sorted list ... ");
        System.out.println(newNumbers);
        for (Integer number : newNumbers){
            System.out.println(number);
        }
    }
}
