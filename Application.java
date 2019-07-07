package com.madhawee.java.training;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {

    WithoutStream();
    Stream();
    StreamLetter();
    Max();


    }

    public static void WithoutStream(){

        List<Student> studentList = Student.getAllStudent();
        System.out.println(studentList.size());

        List<Student> newStudent = new ArrayList<>();

        for(Student student : studentList){
            if (student.getMarks()>50){

                newStudent.add(student);

            }
        }
        System.out.println("________________________");
        System.out.println(studentList.size());

        System.out.println(newStudent.size());
    }

    public static void Stream(){
        List<Student> students = Student.getAllStudent().stream().
                filter(student -> student.getMarks()>50).collect(Collectors.toList());
        System.out.println(students.size());
    }

    public static void StreamLetter(){
        List<Student>students = Student.getAllStudent().stream().
                filter(student -> student.getName().contains("i")).collect(Collectors.toList());
        System.out.println(students.size());
    }

    public static void Max(){
        Optional<Student> student = Student.getAllStudent().stream().max(Comparator.comparing(Student::getMarks));
        System.out.println(student);
    }

    }

