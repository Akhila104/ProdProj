package com.example.Crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication {

public static void main(String[] args) {
	try {
		SpringApplication.run(CrudApplication.class, args);
	} catch (Exception e) {
		e.printStackTrace();
	}
}

}
