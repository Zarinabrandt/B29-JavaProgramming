package day19_ArrayIntro;

import java.util.Arrays;

public class ArrayObjects {
    public static void main(String[] args) {

        int[] arr1 = {10,20,30,40,50};
        int[] arr2 = arr1;
        int[] arr3 = arr2;

        arr1[0] = 1000;
        arr2[2] = 3000;

        //print for all three will be same because it signed in to one object
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        System.out.println("--------------------------------------------------");

        String[] a1 = {"Umran","Memed"}; //eligible for garbage collection after new object

         a1 = new String[]{"James","Goga"}; //new array object

        System.out.println(Arrays.toString(a1));
    }
}
