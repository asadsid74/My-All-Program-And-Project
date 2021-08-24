package com.sb.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Author implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int a_id;
	
	private String a_name;
	
	private String a_lang;
	 
	@OneToOne(mappedBy = "author")
	private Book book;

	public int getA_id() {
		return a_id;
	}

	public void setA_id(int a_id) {
		this.a_id = a_id;
	}

	public String getA_name() {
		return a_name;
	}

	public void setA_name(String a_name) {
		this.a_name = a_name;
	}

	public String getA_lang() {
		return a_lang;
	}

	public void setA_lang(String a_lang) {
		this.a_lang = a_lang;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Author(int a_id, String a_name, String a_lang, Book book) {
		super();
		this.a_id = a_id;
		this.a_name = a_name;
		this.a_lang = a_lang;
		this.book = book;
	}

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Author [a_id=" + a_id + ", a_name=" + a_name + ", a_lang=" + a_lang + ", book=" + book + "]";
	}
	
	
	
	

}
