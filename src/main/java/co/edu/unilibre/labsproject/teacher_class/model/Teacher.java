package co.edu.unilibre.labsproject.teacher_class.model;

import java.util.Date;

public class Teacher {
	private Long id;
	private String name;
	private Double salary;
	private Long port;
	private Date birthDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public Long getPort() {
		return port;
	}
	public void setPort(Long port) {
		this.port = port;
	}
}
