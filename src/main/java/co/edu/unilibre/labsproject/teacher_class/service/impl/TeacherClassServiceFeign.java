package co.edu.unilibre.labsproject.teacher_class.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unilibre.labsproject.teacher_class.feign.TeacherServiceClientFeign;
import co.edu.unilibre.labsproject.teacher_class.model.Teacher;
import co.edu.unilibre.labsproject.teacher_class.model.TeacherClass;
import co.edu.unilibre.labsproject.teacher_class.service.ITeacherClassService;

@Service("teacherclassServiceFeign")
public class TeacherClassServiceFeign implements ITeacherClassService{

	@Autowired
	private TeacherServiceClientFeign teacherServiceClientFeign; 
	
	@Override
	public List<TeacherClass> getAll() {
		//List<Teacher> teachers = teacherServiceClientFeign.getList();
		List<Product> teachers = Arrays.asList(clientRest.getForObject("http://teacher-service/list", Teacher[].class));
		return teachers.stream().map(teacher -> new TeacherClass(teacher, "Class x")).collect(Collectors.toList());
	}

	@Override
	public TeacherClass findById(Long id, String tclass) {
		return new TeacherClass(teacherServiceClientFeign.getById(id), tclass);
	}

}
