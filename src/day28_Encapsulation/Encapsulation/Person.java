package day28_Encapsulation.Encapsulation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {

    private String name;
    private int age;
    private char gender;
    private LocalDate dateOfBirth;


    public Person(String name, int age, char gender, LocalDate dateOfBirth) {
        setName(name);
        setAge(age);
        setGender(gender);
        setDateOfBirth(dateOfBirth);
    }

    public String getName() {

        if (name == null){
            return "Unknown";
        }

        return name;
    }

    public void setName(String name) {

        if (name.isEmpty() || name.isBlank()){
            System.err.println("Person name can not be empty or blank");
            System.exit(1);
        }

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age <= 0 || age > 120){
            System.err.println("Invalid age: "+age);
        }

        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        if (gender != 'F' && gender != 'M'){
            System.err.println("Invalid gender");
            System.exit(1);
        }

        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        LocalDate today = LocalDate.now();

        if (dateOfBirth.isAfter(today)){
            System.err.println("Invalid date of birth: "+dateOfBirth);
        }

        this.dateOfBirth = dateOfBirth;
    }



    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", dateOfBirth=" + getDateOfBirth().format(DateTimeFormatter.ofPattern("MMMM-d-y")) +
                '}';
    }
}
/*
Variables:
    name, age, gender, dateOfBirth
        name:
            Write: can not be null/empty/blank
            Read: if name is not, return "Unknown" instead
        age:
            Write: age can not be less than zero or greater than 120
        gender:
            Write: gender can only be 'M' or 'F'
        dateOfBirth:
            Write:  can not be after today's date
    Add a constructor that can set all the fields
    Add toString()
 */