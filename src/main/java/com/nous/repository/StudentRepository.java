package com.nous.repository;

import org.springframework.data.repository.CrudRepository;

import com.nous.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
