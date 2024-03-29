package day37_exceptions;

import day35_polymorphism.transportationTask.Car;

public class MultiCatchBlock {
    public static void main(String[] args) {

        System.out.println("Program1 started");

        Car car = null;

        try {
            car.drive();
        }catch(ArithmeticException e){ //NullPointerException
            System.out.println("First Catch Block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("Second Catch Block");
            e.printStackTrace();
        }catch (NullPointerException e ){
            System.out.println("Third Catch Block");
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Fourth Catch Block");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("Fifth Catch Block");
            e.printStackTrace();
        }

        System.out.println("program1 ended");

        /*       // Multiple try blocks are NOT allowed
        try{

        }catch (RuntimeException e){

        }try{

        }try{

        }try{

        }
         */


    }
}
