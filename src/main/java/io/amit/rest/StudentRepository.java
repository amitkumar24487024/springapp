package io.amit.rest;

import org.springframework.data.jpa.repository.JpaRepository;

import io.amit.rest.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
