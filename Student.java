package com.madhawee.java.training;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private double marks;


    public Student(String n, double m) {
        this.setName(n);
        this.setMarks(m);
    }


    public static List<Student> getAllStudent() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Madhee", 88));
        studentList.add(new Student("Aki", 90));
        studentList.add(new Student("Madhawee", 80));
        studentList.add(new Student("Akila", 99));
        studentList.add(new Student("Rexi", 82));
        studentList.add(new Student("Rex", 82));
        studentList.add(new Student("Rex", 82));
        studentList.add(new Student("Rex", 82));
        studentList.add(new Student("Rex", 82));
        studentList.add(new Student("Rex", 82));

        return studentList;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}