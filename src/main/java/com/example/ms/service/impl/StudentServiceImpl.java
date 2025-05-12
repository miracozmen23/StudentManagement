package com.example.ms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ms.entity.Student;
import com.example.ms.repository.StudentRepository;
import com.example.ms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getOneStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student editStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
		
	}

}
