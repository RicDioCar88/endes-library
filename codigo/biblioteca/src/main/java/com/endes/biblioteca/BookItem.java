package com.endes.biblioteca;

import java.util.Date;
import java.util.UUID;

import com.endes.biblioteca.enumerado.Language;

public class BookItem extends Book{

	private String barcode;
	private RFID tag;
	private boolean isReferenceOnly;
	
	public BookItem(String iSBN, String title, String sumary, String publisher, Date publication, Integer numberOfPages,
			Language language) {
		super(iSBN, title, sumary, publisher, publication, numberOfPages, language);
		this.barcode=UUID.randomUUID().toString();
		//this.tag=tag;
		this.isReferenceOnly=true;
	}

	@Override
	public String toString() {
		return "BookItem [barcode=" + barcode + ", tag=" + tag + ", isReferenceOnly=" + isReferenceOnly + ", getISBN()="
				+ getISBN() + ", getTitle()=" + getTitle() + ", getSumary()=" + getSumary() + ", getPublisher()="
				+ getPublisher() + ", getPublication()=" + getPublication() + ", getNumberOfPages()="
				+ getNumberOfPages() + ", getLanguage()=" + getLanguage() + "]";
	}
	
	
	
	
	
	
}
