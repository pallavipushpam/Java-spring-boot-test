package com.nous.service;

import java.util.List;

import com.nous.model.Student;

public interface StudentService {
	
	List<Student> getAllStudent();
	Student getStudentById(Long id);
	Student saveStudent(Student student);
	String deleteStudent(Long id);
	Student updateStudent(Long id, Student student);
	

}
