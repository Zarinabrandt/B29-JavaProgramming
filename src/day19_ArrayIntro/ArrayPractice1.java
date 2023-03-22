package day19_ArrayIntro;

import java.util.Arrays;

public class ArrayPractice1 {
    public static void main(String[] args) {

        String[] myGroup = new String[5]; // this line can be fixed, if change the number in array then we can assign more

        myGroup[0] ="Gulchin";

        //for last member of group we can assign as 4 or myGroup.length()
        //myGroup[4] ="Asel";
        myGroup[myGroup.length-1] = "Asel";
        myGroup[2] ="Sumaye";
        myGroup[1] ="Abdula";
        myGroup[3] ="Nikita";

        System.out.println(Arrays.toString(myGroup));

        myGroup[1] ="Kuzzat";

        System.out.println(Arrays.toString(myGroup));

        System.out.println("--------------------------------------");

        for (int i = myGroup.length-1; i >= 0; i--) {
            System.out.println(myGroup[i]);
        }

        System.out.println("----------------------------------------");

        // shortcut for iterate the array is myGroup.fori // prints from beginning to the end
        for (int i = 0; i < myGroup.length; i++) {
            System.out.println(myGroup[i]);
        }

        // iterate to reverse order shortcut will be myGroup.forr
        for (int i = myGroup.length - 1; i >= 0; i--) {
            System.out.println(myGroup[i]);
        }


        


    }
}
