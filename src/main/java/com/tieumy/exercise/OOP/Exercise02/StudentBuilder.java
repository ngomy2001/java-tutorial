package com.tieumy.exercise.OOP.Exercise02;

import java.time.LocalDate;

public interface StudentBuilder {
    StudentBuilder firstName(String firstName);

    StudentBuilder lastName(String lastName);

    StudentBuilder email(String email);

    StudentBuilder gender(Gender gender);

    StudentBuilder birthday(LocalDate birthday);

    StudentBuilder className(String className);

    StudentBuilder address(String address);

    StudentBuilder phone(String phone);

    Student build();
}
