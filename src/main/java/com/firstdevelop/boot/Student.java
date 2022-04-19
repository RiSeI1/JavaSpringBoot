package com.firstdevelop.boot;

import java.time.LocalDateTime;

/**
 * @author study
 *
 */
public class Student {
	
	// エンティティ定義する
	private int id;
	
	private String name;
	
	private LocalDateTime birthday;

	private int age;

	private double score;

	private int classid;
	
	private String address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public int getClassid() {
		return classid;
	}
	public void setClassid(int classid) {
		this.classid = classid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * @return the birthday
	 */
	public LocalDateTime getBirthday() {
		return birthday;
	}
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(LocalDateTime birthday) {
		this.birthday = birthday;
	}
	/**
	 * @param id
	 * @param name
	 * @param birthday
	 * @param age
	 * @param score
	 * @param classid
	 * @param address
	 */
	public Student(int id, String name, LocalDateTime birthday, int age, double score, int classid, String address) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.age = age;
		this.score = score;
		this.classid = classid;
		this.address = address;
	}
	/**
	 * 
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	
	 

}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", birthday=" + birthday + ", age=" + age + ", score=" + score
				+ ", classid=" + classid + ", address=" + address + "]";
	}
}