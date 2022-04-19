package com.firstdevelop.boot.entity;



public class Student {
	private int id;
	private String name;
	private int age;
	private double score; // ëoê∏ìxè¨êî
	private String address;
	private String stuClass;
	
	public Student () {}

	/**
	 * @param id
	 * @param name
	 * @param age
	 * @param score
	 * @param address
	 */
	public Student(int id, String name, int age, double score, String address,String stuClass) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.score = score;
		this.address = address;
		this.stuClass = stuClass;
	}
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStuClass() {
		return stuClass;
	}
	public void setStuClass(String stuClass) {
		this.stuClass = stuClass;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", score=" + score + ", address=" + address
				+ ", stuClass=" + stuClass + "]";
	}
	
	

}