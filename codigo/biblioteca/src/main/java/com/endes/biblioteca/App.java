package com.endes.biblioteca;

import com.endes.biblioteca.enumerado.Language;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		for(Language lang : Language.values()) {
			System.out.println(lang);
		}
	}
}
