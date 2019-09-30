package co.edu.unilibre.labsproject.teacher_class.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unilibre.labsproject.teacher_class.model.TeacherClass;
import co.edu.unilibre.labsproject.teacher_class.service.ITeacherClassService;

@RestController
public class TeacherClassController {
	
	@Autowired(required = true)
	//@Qualifier("teacherclassServiceFeign")
	@Qualifier("teacherclassServiceRestTemplate")
	private ITeacherClassService teacherclassService;
	
	@GetMapping("/list")
	public List<TeacherClass> getAll(){
		return teacherclassService.getAll();
	}
	
	@GetMapping("/{id}/{tclass}")
	public TeacherClass getById(@PathVariable Long id, @PathVariable String tclass) {
		return teacherclassService.findById(id, tclass);
	}
}
