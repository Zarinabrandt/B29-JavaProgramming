package day14_For_Loop;

public class For_loop_Practice {
    public static void main(String[] args) {


        //for (int i=5; i <= 10; i++ ){   // if it was i-- then it will print infinite time
        //   System.out.println("Hello Cydeo"); //6 times
        //}


        // this next code is for backwards direction to print line 6-8

        for (int i = 10; i >= 5; i--) { // i-- it's used for kogda chislo ot obratnogo //i: 10↻ 9↻ 8↻ 7↻ 6↻ 5↻ 4
            System.out.println("Hello Cydeo"); // prints 6 times                      // 1, 2, 3, 4, 5, 6
        }

        System.out.println("Hello World");

        System.out.println("---------------------------------------");

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum); //5050


        System.out.println("------------------------------------------");


        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }

        System.out.println();


        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");
        }


    }
}
