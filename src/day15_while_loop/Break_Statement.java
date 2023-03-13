package day15_while_loop;

public class Break_Statement {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i == 6){ // if i's value reaches 6
                break; // exits the loop
            }
            System.out.println(i);
        }

        System.out.println("-------------------------------------");

        for (char i = 'A'; i <= 'Z'; i++) {

            if (i =='J'){
                System.out.println(i);
                break;
            }


        }

        System.out.println("------------------------------");

        for (;;){  //Infinite loop
            System.out.println("Hello");
            break;   //exits the infinite loop
           // System.out.println("Hi");  will give error
        }




    }
}
