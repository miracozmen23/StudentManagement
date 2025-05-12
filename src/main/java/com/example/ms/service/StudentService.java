package com.example.ms.service;

import java.util.List;

import com.example.ms.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getOneStudentById(Long id);
	
	Student editStudent(Student student);
	
	void deleteStudentById(Long id);
}
