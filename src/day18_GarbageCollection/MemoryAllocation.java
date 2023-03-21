package day18_GarbageCollection;

import day17_CustomClass.Employee;

class Car{

    public String brandt;
    public String model;
    public String color;
    public int year;

}

public class MemoryAllocation {

    public static void main(String[] args) {
        int a = 100; // stack

        Car car = new Car();
      //   stack     heap

        System.out.println("--------------------------------------------");

        Employee employee1 = new Employee();
        Employee employee2 = employee1;

        employee1.setInfo("Rifat", 30, 'M', "Java Developer", 95000, "A12");

        System.out.println(employee1);
        System.out.println(employee2);

        System.out.println("--------------------------------------------");

        String batch1 = new String("Java");
        String batch2 = new String("Java");
        String batch3 = new String("Java");


    }

    public static void method1(){
        int b = 200; // stack
    }

    public static  void method2(){
        String c = "Hello World"; // "Hello World", yes it is string literal but this is referencing an object, so it will be in the heap inside the String pool
        // "c" will be in the stack

        String d = new String("Hello World");
        //   stack                     heap
    }



}
