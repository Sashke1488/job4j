package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Bautin Alexander");
        student.setGroup("B16 - V72");
        student.setAdmission(new Date());

        System.out.println(student.getName() + " studying in group " + student.getGroup() + " from " + student.getAdmission());
    }
}
