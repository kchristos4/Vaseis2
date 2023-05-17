package mye030.DBMS_data_visualization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import mye030.DBMS_data_visualization.*;
import mye030.DBMS_data_visualization.DAO.*;
import mye030.DBMS_data_visualization.entities.countries;
import mye030.DBMS_data_visualization.gui.*;

//@SpringBootApplication
public class Test3Application implements CommandLineRunner {
	@Autowired
	private countriesDAO cDAO;
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = new SpringApplicationBuilder(GraphicalInterface.class).headless(false).run(args);
		SpringApplication.run(Test3Application.class, args);
		
		
		
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println("############################################");
		System.out.println("app started");
		System.out.println("############################################");
		System.out.println(cDAO.findAll().get(100).getOfficial_Name());
		GraphicalInterface.main(args);

	}

}
