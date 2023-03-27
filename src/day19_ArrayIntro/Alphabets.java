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

        System.out.println("---------------------------------------------------");

        //quiz

        char[] array = {'D','C','B','A'};
        Arrays.sort(array);
        for (char each : array) {
            System.out.println(each + " ");
            if (each == 'D');
            continue;
        }

        System.out.println("---------------------------------------------------");

        int wd = 0;
        String[] days = {"Sun","Sat","Wed","Sat"};

        for (int i = 0; i < days.length; i++) {
            switch(days[i]){
                case "Sat":
                case "Sun":
                    wd -= 1;
                    break;
                case "Mon":
                    wd +=1;
                case "Wed":
                    wd +=1;
            }
        }

        System.out.println(wd);

        System.out.println("---------------------------------------------------");

        int[] num1 = new int[3];
        int[] num2 = {1,2,3,4,5};
        num1 = num2;

        for (int i = 0; i < num2.length; i++){
            System.out.println(num1[i]);
        }

        System.out.println("---------------------------------------------------");

        String[] planets = {"Mercury","Venus","Earth","Mars"};
        int x = planets.length;
        int y = planets[1].length();

        System.out.println(x + " " + y);

        System.out.println("---------------------------------------------------");

        int[] arr = {1,2,3,4};
        int i =0;

        do{
            System.out.println(arr[i] + " ");
            i++;
        }while(i < arr.length-1);





    }
}
