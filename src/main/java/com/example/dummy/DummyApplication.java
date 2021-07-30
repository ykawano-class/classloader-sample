package com.example.dummy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.loader.I;
import org.springframework.boot.loader.Sub;


@SpringBootApplication
public class DummyApplication {

	public static void main(String[] args) {
		Sub s = new Sub();
		s.s();

		I i = new Impl();
		i.hello();

		SpringApplication.run(DummyApplication.class, args);
	}

}
