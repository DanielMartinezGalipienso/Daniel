package com.example.BootH2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.github.javafaker.Faker;

@Service
public class BookService {
	
	static List<Book> library = new ArrayList<Book>();
	static {
		
		//The old manual books
		/*
		Book book1 = new Book("Anna Karenina", "BASGA15-252S38", 568, 1872, "Leon Tolstoi");
		Book book2 = new Book("The LightHouse", "BSDGA15-278912", 356, 1926, "Virginia Wolf");
		Book book3 = new Book("War and Peace", "BAgyg15-250092", 528, 1872, "Leon Tolstoi");
		Book book4 = new Book("Orlando", "yuplA15-340112", 356, 1926, "Virginia Wolf");
		library.add(book1);
		library.add(book2);
		library.add(book3);
		library.add(book4);
		*/
		
		//Now, we use the faker for create books in a for each
		Faker newfaker = new Faker();
		
		for (int i = 0; i < 10; i++) {
			/*
			//Test for books with faker
			
			//Create an empty book
			Book bookToAdd = new Book();
			
			//Add the attributes Name, ISBN, Pages, Year, Author
			bookToAdd.setTitle(newfaker.book().title());
			bookToAdd.setISBN(newfaker.book().genre());
			bookToAdd.setPages(newfaker.book().hashCode());
			bookToAdd.setYear(newfaker.book().hashCode());
			bookToAdd.setAuthor(newfaker.book().publisher());
			
			//Add this book on the library
			library.add(bookToAdd);
			*/
			
			//Test without use books - Zelda
			//

			String title = newfaker.zelda().game();
			String ISBN = newfaker.zelda().character();
			String author = newfaker.zelda().character();
			Book zeldaToAdd = new Book( title, ISBN, 949, 797, author);
			library.add(zeldaToAdd);
			
		}
	}
	
	public List<Book> queryBook(){
		
		return library;
	}
	
	public boolean queryAddBook (Book newbooktoadd) {
		
		return false;
	}
	
	public List<Book> findAll() {
		
		return library;
	}
	
	public boolean queryDeleteBook(String title) {
		
		//To-Do
		//Problems with the Static List<Book>
		for(Book bookOfLibrary : this.library) {
			if(bookOfLibrary.getTitle().equals(title)) {
				this.library.remove(bookOfLibrary);
				break;
			}
			System.out.println("Array books in service/n" + this.library);
		}
		
		return true;
	}
	
	public Book queryDetailBook(String title) {
		
		Book bookToReturn = new Book();
		for (Book bookOfLibrary : this.library) {
			if(bookOfLibrary.getTitle().equals(title)) {
				bookToReturn = bookOfLibrary;
			}
		}
		
		return bookToReturn;
	}

}
