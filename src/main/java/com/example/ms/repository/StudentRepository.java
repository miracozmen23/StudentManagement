package com.example.ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	

}
