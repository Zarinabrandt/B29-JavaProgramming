package day19_ArrayIntro;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        int[] arr1 = new int[100];

        /* this one way to do it
        for (int i = 0, j = 1; i < arr1.length; i++, j++) {
            arr1[i] = j;
        }
         */

        // another way to declare index of number
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i+1;
        }

        System.out.println("arr1 = " + Arrays.toString(arr1));

        System.out.println("------------------------------------------------");

        int[] arr2 = new int[100]; //index: 0~99 // instantiating array

        for (int i = 0, j = 100; i < arr2.length; i++, j--) {  // from last index to first
            arr2[i] = j;
        }

        System.out.println("arr2 = " + Arrays.toString(arr2));


    }
}
