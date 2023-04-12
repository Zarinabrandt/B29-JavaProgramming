package day27_AccessModifiers;

public class TestCydeoStudentObject {
    public static void main(String[] args) {

        System.out.println(CydeoStudentClass.schoolName);

        CydeoStudentClass student1 = new CydeoStudentClass("Ekaterina", 29, 'F');
        CydeoStudentClass student2 = new CydeoStudentClass("Alena",28, 'F');

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);

        System.out.println(student1.secretCode);
        System.out.println(student2.secretCode);






    }
}
