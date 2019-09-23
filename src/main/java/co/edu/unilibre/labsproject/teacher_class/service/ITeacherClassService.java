package co.edu.unilibre.labsproject.teacher_class.service;

import java.util.List;

import co.edu.unilibre.labsproject.teacher_class.model.TeacherClass;

public interface ITeacherClassService {
	public List<TeacherClass> getAll();
	public TeacherClass findById(Long id, String tclass);
}
