package com.example.spring_boot_practice.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
           Student emmanuel =new Student(
                   "Emmanuel",
                   "emma@gmail.com",
                   LocalDate.of(1998, Month.JANUARY,12)
           );

            Student jake = new Student(
                    "Jake",
                    "jake@gmail.com",
                    LocalDate.of(1995, Month.MAY,12)
            );

            repository.saveAll(
                    List.of(emmanuel,jake)
            );
        };
    }
}
