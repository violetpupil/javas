package top.instafever.javas;

import org.joda.time.LocalTime;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@MapperScan("top.instafever.javas.mapper")
public class JavasApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavasApplication.class, args);
		LocalTime current = new LocalTime();
		System.out.println("main start at " + current);
	}

	@GetMapping("/")
	public String index() {
		return "ok";
	}

}
