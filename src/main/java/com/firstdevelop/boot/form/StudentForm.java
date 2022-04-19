package com.firstdevelop.boot.form;

public class StudentForm {
	private int id;
	private String name;
	private int age;
	private double score; // ëoê∏ìxè¨êî
	private String address;
	private String stuClass;
	/**
	 * @param id
	 * @param name
	 * @param age
	 * @param score
	 * @param address
	 */
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
		return "StudentForm [id=" + id + ", name=" + name + ", age=" + age + ", score=" + score + ", address=" + address
				+ ", stuClass=" + stuClass + "]";
	}
}
