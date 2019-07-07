package com.madhawee.java.training;

import java.util.Comparator;
import java.util.Optional;

public class MinMax {

    Optional<Student> st = Student.getAllStudent().stream().max(Comparator.comparing(Student::getMarks));


}
