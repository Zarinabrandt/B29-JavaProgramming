package day18_GarbageCollection;

import day17_CustomClass.Dog;

public class GarbageCollection {
    public static void main(String[] args) {

        // new GarbageCollection().finalize(); // finalize(); method only garbage collector uses it

        String s1 = "Java";
        s1 = null; //"Java" will be eligible for garbage collection after this line

        System.out.println(s1);

       // System.out.println(s1.toUpperCase());

        //System.out.println( s1.replace(null, "Python")); // since there is no object in s1 it will give NullPointerException

        String a = ""; //heap
        String b = null; //it is not exist

        System.out.println("----------------------------------------------------");

        String str1 = "Python";
        str1 = "Cydeo"; //re-assigned to new object

        System.out.println(str1);

        System.out.println("----------------------------------------------------");

        Dog dog1 = new Dog();
        dog1.setInfo("Loki","Husky","Big",'M',5,"Brown");

        Dog dog2 = new Dog();
        dog2.setInfo("Umka", "Golden Retriver", "Small", 'M', 1,"Gray");

        //dog1 = null; // this is one way to put in garbage collection
        dog1 = dog2; // this is another way

        System.out.println(dog1);
        System.out.println(dog2);


        // new Dog().finalize(); // garbage collector calls method finalize();



    }

}
