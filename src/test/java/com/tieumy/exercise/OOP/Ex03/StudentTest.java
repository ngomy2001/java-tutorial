package com.tieumy.exercise.OOP.Ex03;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {
    @Test
    void getFirstName() {
        final var student = Student.builder().firstName("My").build();
        assertEquals("My", student.getFirstName());
    }

    @Test
    void getLastName() {
        final var student = Student.builder().lastName("Ngo").build();
        assertEquals("Ngo", student.getLastName());
    }

    @Test
    void getBirthday() {
        final var student = Student.builder().birthday(LocalDate.of(2001, 1, 26)).build();
        assertEquals(LocalDate.of(2001, 1, 26), student.getBirthday());
    }

    @Test
    void getClassName() {
        final var student = Student.builder().className("GCD0909").build();
        assertEquals("GCD0909", student.getClassName());
    }

    @Test
    void getAddress() {
        final var student = Student.builder().address("Viet Nam").build();
        assertEquals("Viet Nam", student.getAddress());
    }

    @Test
    void getGender() {
        final var student = Student.builder().gender(Gender.FEMALE).build();
        assertEquals(Gender.FEMALE, student.getGender());
    }

    @Test
    void getEmail() {
        final var student = Student.builder().email("ngomy2001@gmail.com").build();
        assertEquals("ngomy2001@gmail.com", student.getEmail());
    }

    @Test
    void getPhone() {
        final var student = Student.builder().phone("0976882993").build();
        assertEquals("0976882993", student.getPhone());
    }

    @Test
    void builder() {
        final var student = Student.builder().firstName("My").address("Da Nang").phone("0976882993").build();
        assertEquals("My", student.getFirstName());
        assertEquals("0976882993", student.getPhone());
        assertEquals("Da Nang", student.getAddress());
    }
}