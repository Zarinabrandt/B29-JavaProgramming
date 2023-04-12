package day27_AccessModifiers;

public class CydeoStudentClass {

    public String name;
    public int age;
    public char gender;

    public static String schoolName;
    public static String secretCode;

    public CydeoStudentClass(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        //schoolName = "Cydeo School";
        //secretCode = "Wooden Spoon";
    }

    static {
        schoolName = "Cydeo School";
        secretCode = "Wooden Spoon";
    }


    public String toString() {
        return "CydeoStudentClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
