package org.example.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Student
{
    private int id;
    private String name;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student(1,"ABC");
        Student s2 = new Student(2,"XYZ");
        Student s3 = new Student(3,"LMN");
        Student s4 = new Student(4,"OPQ");
        Student s5 = new Student(5,null);

        List<Student> listStudent = new ArrayList<>();
        listStudent.add(s1);
        listStudent.add(s2);
        listStudent.add(s3);
        listStudent.add(s4);
        listStudent.add(s5);

        // Using Java 8 streams and lambda expressions to filter students with id = 5
        Student studentWithId = listStudent.stream()
                .filter(student -> student.getId() == 5)
                .findFirst()
                .orElse(null);
        if (studentWithId != null) {
            System.out.println("Student with ID 5: " + studentWithId.getName());
        } else {
            System.out.println("No student found with ID 5");
        }

        System.out.println("-----------------------------------------------------------------");
        System.out.println("NOW WITH OPTIONAL");

        Optional<Student> s = Optional
                .ofNullable(listStudent.stream()
                .filter(student -> student.getId() == 5)
                .findFirst()
                .orElse(null));

        if (!s.isEmpty())
        {
            Optional<String> sName = Optional.ofNullable(s.get().getName());

            sName.ifPresentOrElse(std -> System.out.println("Student is Present = "+std),() -> System.out.println("Student is not Present"));
        }
        else
        {
            System.out.println("Adding here Return statement with costume Exception");
        }

    }
}
