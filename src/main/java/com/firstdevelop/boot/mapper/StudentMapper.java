package com.firstdevelop.boot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.firstdevelop.boot.entity.Student;

@Mapper
public interface StudentMapper {
	List<Student> searchAll();
	
	List<Student> searchClassByStuID(int stuID);
	
	void insert(Student student);
	void delete(@Param("StuID")int ID);
	
}
