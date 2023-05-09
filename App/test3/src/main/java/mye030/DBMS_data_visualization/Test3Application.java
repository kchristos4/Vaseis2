package mye030.DBMS_data_visualization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import mye030.DBMS_data_visualization.*;
import mye030.DBMS_data_visualization.entities.Course;

@SpringBootApplication
public class Test3Application {

	public static void main(String[] args) {

		SpringApplication.run(Test3Application.class, args);
		System.out.println("############################################");
		System.out.println("app started");
		System.out.println("############################################");
		
	}

}
