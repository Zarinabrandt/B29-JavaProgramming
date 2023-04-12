package day26_Static.StudentTask;

public class Student {

         public String name;
         public int age;
         public char gender;
         public String id;

    public Student(String name, int age, char gender, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }


    public void study(){
        System.out.println(name + " is studying");
    }



    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                '}';
    }


}
/*
2. Create a custom class named StudentsGroup
	            Attributes:
	                groupName, groupId, students (ArrayList<Students>)
	            Add a constructor that can set the groupId and groupName
	                    initialize students arraylist in the constructor's body
	            Methods:
	                addStudent(Student): adds the specified student to the students arrayList
	                removeStudent(id): removes the student with the specified id from the students arraylist
	                toString(): displays the groupName, groupId and total number of students when a group object is passed in the print statement
 */