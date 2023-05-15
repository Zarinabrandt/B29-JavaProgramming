package day37_exceptions;

import day27_AccessModifiers.Circle;

public class TestPizzaObject {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza('S',2,3);

        Pizza pizza2 = new Pizza('S',2,3);

        System.out.println(pizza1 == pizza2); //false

        System.out.println(pizza1.equals(pizza2)); //true

        //System.out.println(pizza1.equals(100)); //Invalid object: 100


        Object obj = (Object) new Pizza('S',4,3); //upcasting

        boolean r = obj.equals(pizza2);

        System.out.println(r);

        double total =( (Pizza) obj).calcCost();

        System.out.println(total);

       // double area = ( (Circle)obj ).area(); //downcasting or upcasting can NOT happen when there is no relationship

        //   System.out.println(area);

        System.out.println("Test Completed");



    }
}
