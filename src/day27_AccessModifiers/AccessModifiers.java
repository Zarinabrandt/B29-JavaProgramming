package day27_AccessModifiers;

public class AccessModifiers {

    public static int publicData = 200;

    protected static  int protectedData =300;

    static int defaultData;

    private static int privateData = 500;



    public AccessModifiers(){

    }

    public static void publicMethod(){
        System.out.println("Public");
    }

    protected static void protectedMethod(){
        System.out.println("Protected");
    }

    static void defaultMethod(){
        System.out.println("Default");
    }

    private static void privateMethod(){
        System.out.println("Private");
    }





    public static void main(String[] args) {

        System.out.println(publicData); //public is accessible within same class
        System.out.println(protectedData); // protected is accessible within same package
        System.out.println(defaultData); //default is accessible within same class and package
        System.out.println(privateData); //private is accessible within the same class

        new AccessModifiers();

        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();


    }

}
