package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface IStudentservice {
	
	
	void addStudent(Student student);
	List<Student> getstudentList();
	 Student getStudentById(int stdId);
	 void updateStudent(Student student);
	 void deleteStudent(int stdId);
	

}
