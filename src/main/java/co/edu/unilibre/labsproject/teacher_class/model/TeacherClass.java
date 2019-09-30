package co.edu.unilibre.labsproject.teacher_class.model;

public class TeacherClass {
	private Teacher teacher;
	private String tclass;
	
	public TeacherClass(Teacher teacher, String tclass) {
		super();
		this.teacher = teacher;
		this.tclass = tclass;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public String getTClass() {
		return tclass;
	}
	public void setTClass(String tclass) {
		this.tclass = tclass;
	} 
}
