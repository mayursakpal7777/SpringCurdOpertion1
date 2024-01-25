package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repo.Studentrepo;
import com.example.demo.service.IStudentservice;

@Service
public class Studentserviceimpl implements IStudentservice {
	
	@Autowired
	private  Studentrepo     srepo;

	@Override
	public void addStudent(Student student) {
		srepo.save(student);

	}

	@Override
	public List<Student> getstudentList() {
	
		return srepo.findAll();
	}

	@Override
	public Student getStudentById(int stdId) {
		
		 return srepo.findById(stdId).get();
	}

	@Override
	public void updateStudent(Student student) {
		srepo.save(student);
	}

	@Override
	public void deleteStudent(int stdId) {
		srepo.deleteById(stdId);

	}

}
