package com.firstdevelop.boot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstdevelop.boot.entity.Student;
import com.firstdevelop.boot.form.StudentForm;
import com.firstdevelop.boot.mapper.StudentMapper;

@Service
public class StudentService {
	@Autowired
	private StudentMapper studentMapper;
	
	public List<Student> searchAll(){
		List<Student> studentList = new ArrayList<>();
		List<Student> searchStudentList = studentMapper.searchAll();
		return searchStudentList != null && searchStudentList.size() > 0 ? searchStudentList : studentList;
	}
	public void insert(StudentForm form) {
		Student student = new Student();
		student.setName(form.getName());
		student.setAge(form.getAge());
		student.setScore(form.getScore());
		student.setAddress(form.getAddress());
		student.setStuClass(form.getStuClass());
		
		studentMapper.insert(student);
	}
}
