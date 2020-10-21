package edu.eci.arsw.OpenWather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"edu.eci.arsw.OpenWather"})
public class OpenWatherApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenWatherApplication.class, args);
	}

}
