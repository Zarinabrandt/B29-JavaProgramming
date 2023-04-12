package day26_Static;

public class ConstructorCalls {

    public ConstructorCalls(){
        //this(); //constructor can NOT call itself it will give error. CanNOT contain itself
        System.out.println("Default constructor");
    }

    public ConstructorCalls(int a){
        this(); //constructor call has to be at first step otherwise it will give compile error
        System.out.println("Constructor with int argument");
    }


    public ConstructorCalls(double b){
        System.out.println("Constructor with double argument");
    }


    public ConstructorCalls(String c){
        this(2.5);
        //this(); //Constructor can not be called more than one Constructor

        System.out.println("Constructor with String argument");
    }




    public static void main(String[] args) {

        method1();

        System.out.println("----------------------------");

        method2();

    }

    public static void method1(){
        //ConstructorCalls();
        //this();
        System.out.println("Method1");
    }

    public static void method2(){
        method1();
        System.out.println("Method2");
        method1();
        //method2();
    }



}
