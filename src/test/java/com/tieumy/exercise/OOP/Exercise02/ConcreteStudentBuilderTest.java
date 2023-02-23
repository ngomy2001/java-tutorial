package com.tieumy.exercise.OOP.Exercise02;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConcreteStudentBuilderTest {
    final ConcreteStudentBuilder studentBuilder = new ConcreteStudentBuilder();

    @Test
    void firstName() {
        studentBuilder.firstName("My");
        assertEquals("My", studentBuilder.build().getFirstName());
    }

    @Test
    void lastName() {
        studentBuilder.lastName("Ngo");
        assertEquals("Ngo", studentBuilder.build().getLastName());
    }

    @Test
    void email() {
        studentBuilder.email("myntgcd19832@fpt.edu.vn");
        assertEquals("myntgcd19832@fpt.edu.vn", studentBuilder.build().getEmail());
    }

    @Test
    void gender() {
        studentBuilder.gender(Gender.FEMALE);
        assertEquals(Gender.FEMALE, studentBuilder.build().getGender());
    }

    @Test
    void birthday() {
        studentBuilder.birthday(LocalDate.ofEpochDay(26 / 01 / 2001));
        assertEquals(LocalDate.ofEpochDay(26 / 01 / 2001), studentBuilder.build().getBirthday());
    }

    @Test
    void className() {
        studentBuilder.className("GCD0805");
        assertEquals("GCD0805", studentBuilder.build().getClassName());
    }

    @Test
    void address() {
        studentBuilder.address("Da Nang, Viet Nam");
        assertEquals("Da Nang, Viet Nam", studentBuilder.build().getAddress());
    }

    @Test
    void phone() {
        studentBuilder.phone("0935894700");
        assertEquals("0935894700", studentBuilder.build().getPhone());
    }

    @Test
    void build() {
        studentBuilder.firstName("Moi").lastName("Ngo").className("GCD199").email("moimoi@gmail.com");
        assertEquals("Moi", studentBuilder.build().getFirstName());
        assertEquals("Ngo", studentBuilder.build().getLastName());
        assertEquals("GCD199", studentBuilder.build().getClassName());
        assertEquals("moimoi@gmail.com", studentBuilder.build().getEmail());
    }
}