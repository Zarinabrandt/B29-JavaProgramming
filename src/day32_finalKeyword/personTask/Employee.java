package day32_finalKeyword.personTask;

import java.time.LocalDate;

public class Employee extends Person{
    private String jobTitle;
    private double salary;


    public Employee(String name, char gender, int age, LocalDate dateOfBirth, String jobTitle, double salary) {
        super(name, gender, age, dateOfBirth);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void work(){
        System.out.println(getName()+" is working");
    }



    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                "jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
