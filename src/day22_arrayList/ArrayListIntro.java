package day22_arrayList;

import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {

        int[] array = new int[5]; //{0, 0, 0, 0, 0}

        array[0] = 10; //{10, 0, 0, 0, 0}
        array[1] = 20; //{10,20, 0, 0, 0}
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        //array[5] = 60; // indexOutOfBoneException

        System.out.println(Arrays.toString(array));



    }
}
