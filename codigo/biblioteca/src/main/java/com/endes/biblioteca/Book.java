package com.endes.biblioteca;

import java.util.Date;

import com.endes.biblioteca.enumerado.Language;

/**
 * @author Ricardo
 * @version 1.0
 * 
 * Esta clase representa a un libro abstracto
 * 
 * */

public abstract class Book {
	private String ISBN;
	private String title;
	private String sumary;
	private String publisher;
	private Date publication;
	private Integer numberOfPages;
	private Language language;
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSumary() {
		return sumary;
	}
	public void setSumary(String sumary) {
		this.sumary = sumary;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Date getPublication() {
		return publication;
	}
	public void setPublication(Date publication) {
		this.publication = publication;
	}
	public Integer getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(Integer numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	
	
	
	
	
}
