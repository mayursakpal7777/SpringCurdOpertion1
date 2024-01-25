package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Student;
import com.example.demo.service.IStudentservice;

@Controller
public class Studentcontroller {
	
	@Autowired
	private IStudentservice   service;
	
	@GetMapping("/home")
	public String homePage(Model model)
	{
		model.addAttribute("studentList", service.getstudentList());
		
		
		return "Home";
	}
	@GetMapping("/add")
	public String studentPage()
	{
		return "Student";
		
	}
	@PostMapping("/save")
	public String saveStudent(@ModelAttribute  Student student,Model model)
	{
		service.addStudent(student);
		model.addAttribute("studentList",service.getstudentList());
		model.addAttribute("msg","Student Inserted Successfully");
		return "Home";
		
	}
	@GetMapping("delete")
	public String deleteStudent(@RequestParam Integer id,Model model)
	{
		service.deleteStudent(id);
		model.addAttribute("msg","Student Removed Successfully");
		model.addAttribute("studentList",service.getstudentList());
		return "Home";
	}
	@GetMapping("edit")
	public String getStudentById(@RequestParam Integer id, Model model)
	{
		model.addAttribute("student",service.getStudentById(id));
		return "UpdateStudent";
	}
	@PostMapping("/update")
	public String updateStudent(@ModelAttribute Student student,Model model)
	{
		service.updateStudent(student);
		model.addAttribute("studentList",service.getstudentList());
		model.addAttribute("msg","Student Updated Successfully");
		return "Home";
	}

}
