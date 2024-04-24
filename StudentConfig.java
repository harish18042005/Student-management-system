package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.APRIL;
import static java.time.Month.MARCH;


@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    "Harish",
                    "Harish@mail.com",
                    LocalDate.of(2005, APRIL, 18));

            Student alex = new Student(
                    "Alex",
                    "Alex@mail.com",
                    LocalDate.of(2004, MARCH, 20));

            repository.saveAll(
                    List.of(mariam, alex)
            );
        };
    }

}

