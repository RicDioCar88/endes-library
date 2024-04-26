package com.endes.biblioteca.main;


import java.util.Date;

import com.endes.biblioteca.Book;
import com.endes.biblioteca.BookItem;
import com.endes.biblioteca.enumerado.Language;
import com.github.javafaker.Faker;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		Faker faker = new Faker();
		
		Book libro = new BookItem(faker.code().isbn10(), faker.book().title(), faker.lorem().sentence(), faker.book().publisher(), faker.date().birthday(10, 100), faker.number().numberBetween(10, 1500), Language.ES);
		
		System.out.println(libro);
		
		
		System.out.println(faker.animal());
		
		/**
		 * Prueba de uso de enumerado
		 */
		
		for(Language lang : Language.values()) {
			System.out.println(lang);
		}
		
		
	}
}
