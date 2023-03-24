package day19_ArrayIntro;

import java.util.Arrays;

public class Alphabets {
    public static void main(String[] args) {

        char[] ascending = new char[26]; //index: 0~25
        char[] descending = new char[26]; //index: 25~0

        for (int i = 0,j ='A',k = 'Z'; i < ascending.length; i++, j++, k--) {
            ascending[i] = (char) j; // A ~ Z
            descending[i] = (char) k; // Z ~ A
        }

        for (int i = descending.length - 1; i >= 0; i--) {

        }

        System.out.println(Arrays.toString(ascending));
        System.out.println(Arrays.toString(descending));

        System.out.println("-------------------------------------------------");

        char[] characters = new char[65535];

        for (int i = 0; i < characters.length; i++) {
            characters[i] = (char) i;
        }

        System.out.println(Arrays.toString(characters));

    }
}