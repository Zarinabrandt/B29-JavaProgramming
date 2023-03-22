package day19_ArrayIntro;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        int score1 = 85;
        int score2 = 75;
        int score3 = 78;
        int score4 = 88;
        int score5 = 95;

        System.out.println("------------------------------");

        int[] scores = new int[5];// index: 0 ~ 4
        // minimum size of array is 0(zero). As many aliments we store in array as many it gives

        scores[2] = 78;
        scores[0] = 85;
        scores[1] = 75;
        scores[3] = 88;
        scores[4] = 95;
        //after line 30 since it signed in new Array object lines 19-23 goes to the garbage collection (gone)

        //can not increase nor decrease
        //scores[5] = 100; ArraysIndexOutOfBounds
        //scores[-1] = 65; same

        //scores = new int[10]; //index: 0~9

        //scores = new int[50]; // index: 0~49 //new Array object

        System.out.println(  Arrays.toString(scores)  );

        System.out.println( scores[2] );

        System.out.println("---------------------------------------");

        for (int i = 0; i < scores.length; i++) { //i: 0~4 index numbers of scores array
            System.out.println(scores[i]);
        }

        System.out.println("--------------------------------------");

        System.out.println( scores[scores.length-1] );

        System.out.println("--------------------------------------");




    }
}
