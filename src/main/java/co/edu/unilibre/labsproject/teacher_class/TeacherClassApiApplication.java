package co.edu.unilibre.labsproject.teacher_class;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TeacherClassApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeacherClassApiApplication.class, args);
	}

}
