package com.example.BootH2;

public class Book {
	
	//Attributes
	
	private String title;
	private String ISBN;
	private int pages;
	private int year;
	private String author;
	
	//Constructors
	
	public Book() {
		super();
	}
	public Book(String title, String ISBN, int pages) {
		super();
		this.title = title;
		this.ISBN = ISBN;
		this.pages = pages;
	}
	
	public Book(String title, String ISBN, int pages, int year, String author) {
		super();
		this.title = title;
		this.ISBN = ISBN;
		this.pages = pages;
		this.year = year;
		this.author = author;
	}
	

	//Getter and Setters
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	
	
}
