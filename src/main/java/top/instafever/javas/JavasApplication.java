package top.instafever.javas;

import org.joda.time.LocalTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavasApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavasApplication.class, args);
		LocalTime current = new LocalTime();
		System.out.println("main start at " + current);
	}

}
