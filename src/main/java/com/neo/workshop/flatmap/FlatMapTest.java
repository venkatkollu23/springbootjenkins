package com.neo.workshop.flatmap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.fasterxml.jackson.databind.type.LogicalType.Collection;

public class FlatMapTest {

    public static void main(String[] args){

List<Student> studentList = new ArrayList<>();

        Student venkat = new Student();
        venkat.setName("Venkat");
        venkat.setId("1");

        Subject maths= new Subject();
        maths.setName("Maths");
        maths.setMarks(70);
        venkat.add(maths);


        Subject social = new Subject();
        social.setMarks(80);
        social.setName("Social");
        venkat.add(social);

        studentList.add(venkat);

        Student vijay = new Student();
        vijay.setName("vijay");
        vijay.setId("2");

        Subject vijaymaths= new Subject();
        vijaymaths.setName("Maths");
        vijaymaths.setMarks(90);
        vijay.add(vijaymaths);

        Subject vijaysocial = new Subject();
        vijaysocial.setMarks(80);
        vijaysocial.setName("Social");
        vijay.add(vijaysocial);

        studentList.add(vijay);

    List<Subject> subjectList =    studentList.stream().flatMap(student -> student.getSubjectList().stream())
                .collect(Collectors.toList());

    System.out.println(subjectList);
           Optional<Subject> maxSubjectMarks =    studentList.stream()
                   .flatMap(student -> student.getSubjectList().stream())
                    .min( (o1,o2) -> o1.compareTo(o2) );

            System.out.println(  maxSubjectMarks.get());
    }
}
