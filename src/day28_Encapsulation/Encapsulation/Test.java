package day28_Encapsulation.Encapsulation;

public class Test {

    public static void main(String[] args) {

        Student student = new Student();

        //student.age = -200;

        //System.out.println(student.age);

        student.setAge(25);

        System.out.println( student.getAge() );

        System.out.println("Test Completed");


        student.setName("Sara");
        System.out.println(student.getName());





    }





}
