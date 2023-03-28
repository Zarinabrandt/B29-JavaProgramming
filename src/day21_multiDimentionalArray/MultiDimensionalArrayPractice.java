package day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {
    public static void main(String[] args) {

        String[] group1 = {"James","Lara","Tata","Alla"};
        String[] group2 = {"Kappa","Kata","Kelly"};
        String[] group3 = {"Zarina","Zara","Zakana","Zippo","Zain"};
        String[] group4 = {"Nana","Nina"};

        String[][] groups = { group1, group2, group3, group4 };

        for (int i = 0; i < groups.length; i++) {
           String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (int j = 0; j < eachGroup.length; j++) {
                String eachStudent = eachGroup[j];
                System.out.println(eachStudent);
            }
        }

        System.out.println("-----------------------------------------------------------");

        for (int i = groups.length - 1; i >= 0; i--) {

           String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }
        }

        System.out.println("-----------------------------------------------------------");

        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup));
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }
        }

        System.out.println("-----------------------------------------------------------");

        System.out.println(groups); //hashcode

        System.out.println(Arrays.toString(groups)); //hashcode toString ==> for single dimensional arrays only

        System.out.println(Arrays.deepToString(groups) );//deepToString ==> for multi-dimensional arrays only





    }
}
