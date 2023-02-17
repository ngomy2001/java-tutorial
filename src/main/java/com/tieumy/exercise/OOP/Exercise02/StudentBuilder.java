package com.tieumy.exercise.OOP.Exercise02;

import java.time.LocalDate;

public interface StudentBuilder {
    StudentBuilder firstName(final String firstName);

    StudentBuilder lastName(final String lastName);

    StudentBuilder email(final String email);

    StudentBuilder gender(final Gender gender);

    StudentBuilder birthday(final LocalDate birthday);

    StudentBuilder className(final String className);

    StudentBuilder address(final String address);

    StudentBuilder phone(final String phone);

    Student build();
}
