package com.tieumy.exercise.OOP.Exercise02;

import java.time.LocalDate;

public class ConcreteStudentBuilder implements StudentBuilder {
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String className;
    private String address;
    private Gender gender;

    private String email;
    private String phone;

    @Override
    public StudentBuilder firstName(final String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public StudentBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public StudentBuilder email(String email) {
        this.email = email;
        return this;
    }

    @Override
    public StudentBuilder gender(Gender gender) {
        this.gender = gender;
        return this;
    }

    @Override
    public StudentBuilder birthday(LocalDate birthday) {
        this.birthday = birthday;
        return this;
    }

    @Override
    public StudentBuilder className(String className) {
        this.className = className;
        return this;
    }

    @Override
    public StudentBuilder address(String address) {
        this.address = address;
        return this;
    }

    @Override
    public StudentBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public Student build() {
        return new Student(firstName, lastName, birthday, className, address, gender, email, phone);
    }
}
