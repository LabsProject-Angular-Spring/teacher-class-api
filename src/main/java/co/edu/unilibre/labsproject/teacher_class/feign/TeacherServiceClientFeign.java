package co.edu.unilibre.labsproject.teacher_class.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import co.edu.unilibre.labsproject.teacher_class.model.Teacher;

@FeignClient(name = "teacher-service")
public interface TeacherServiceClientFeign {
	
	@GetMapping("/list")
	public List<Teacher> getList();
	
	@GetMapping("/{id}")
	public Teacher getById(@PathVariable Long id);
}
