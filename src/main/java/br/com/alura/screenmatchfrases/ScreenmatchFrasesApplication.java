package br.com.alura.screenmatchfrases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchFrasesApplication {

	@Autowired
	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchFrasesApplication.class, args);
	}

}
