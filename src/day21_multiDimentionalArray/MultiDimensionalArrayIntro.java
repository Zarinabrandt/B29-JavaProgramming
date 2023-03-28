package day21_multiDimentionalArray;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {

        int[] arr1 = {10,20,30};
        int[] arr2 = {40,50,60,70,80};
        int[] arr3 = {90,100};
        int[] arr4 = {1000, 2000};

        System.out.println("---------------------------------------");
        // index:           0  1  2     0  1  2  3  4    0   1
        int[][] arr2D = { {10,20,30}, {40,50,60,70,80}, {90,100}, arr4 }; // index: 0~3
        // index:              0              1            2       3

        System.out.println(arr2D.length);


    }
}
