package com.firstdevelop.boot.controller;

import java.text.NumberFormat;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.firstdevelop.boot.entity.Student;
import com.firstdevelop.boot.entity.UserEntity;
import com.firstdevelop.boot.form.StudentForm;
import com.firstdevelop.boot.mapper.StudentMapper;
import com.firstdevelop.boot.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private StudentMapper studentMapper;
	
	@RequestMapping("/searchAll")
	public String searchALL(Model model,HttpSession session) {	
		
		UserEntity user = (UserEntity)  session.getAttribute("user");
		//System.out.println(user.getUserName());
		
		//List<Student> stu_list = studentMapper.searchClassByStuID(user.getStuID());
		List<Student> stu_list = studentService.searchAll();
		model.addAttribute("stu_list",stu_list);
		Student maxScore= stu_list.get(1); 
		for(int i =1;i < stu_list.size();i++) {
			if(stu_list.get(i).getScore()>maxScore.getScore()){
				maxScore=stu_list.get(i);
			}
		}
		Student maxAge= stu_list.get(1);
		for(int i =1;i < stu_list.size();i++) {
			if(stu_list.get(i).getAge()>maxAge.getAge()){
				maxAge=stu_list.get(i);
			}
		}
		//System.out.print(maxScore + maxAge);
		Double aveScore= stu_list.get(1).getScore();
		int aveAge= stu_list.get(1).getAge();
		for(int i =1;i < stu_list.size();i++) {
			aveScore += stu_list.get(i).getScore();
			}
		aveScore /= stu_list.size();
		
		for(int i =1;i < stu_list.size();i++) {
			aveAge += stu_list.get(i).getAge();
			}
		aveAge /= stu_list.size();
		NumberFormat numberFormat = NumberFormat.getInstance();  
		
		numberFormat.setMaximumFractionDigits(2);
		model.addAttribute("maxScore",maxScore);
		model.addAttribute("maxAge",maxAge);
		model.addAttribute("aveScore",numberFormat.format(aveScore));
		model.addAttribute("aveAge",aveAge);
		System.out.print(aveScore + aveAge);
		return "/student/all";
		
	}
	@RequestMapping("/add")
	public String add() {
		return "/student/add";
	}

	@RequestMapping("/insert")
	public String insert(StudentForm form) {
		studentService.insert(form);
		return "redirect:/student/searchAll";
	}
}