package com.example.dummy;

import com.example.interfaces.I;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DummyApplication {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getContextClassLoader());
		I i = new Impl();
		i.hello();
		SpringApplication.run(DummyApplication.class, args);
	}

}
