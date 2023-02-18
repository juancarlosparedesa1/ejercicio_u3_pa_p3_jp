package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.IItemService;

@SpringBootApplication
public class EjercicioU3PaP3JpApplication implements CommandLineRunner {

	@Autowired
	private IItemService iItemService;
	public static void main(String[] args) {
		SpringApplication.run(EjercicioU3PaP3JpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//1.
		this.iItemService.ingresar("1");
		this.iItemService.ingresar("2");
		
		
	}

}
