package com.example.BootH2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/books")
public class BookController {
	
	@Autowired
	BookService service;
	
	@RequestMapping("/allbooks")
	public String showBooks (Model model) {
		
		model.addAttribute("library", service.findAll());
		return "library";
	}
	
	@RequestMapping("/newBook")
	public String newBook() {
		
		//Some stuff to do: for example, validation
		return "newBook";
	}
	
	@RequestMapping("/addblock")
	public String createBook(Book book, Model model) {
		
		//bookService.queryAddBook(book);
		//model.addAttribute("booksfromController", bookService.queryBooks());
		
		return "newBook";
	}
	
	@RequestMapping("/deletebook")
	public String removeBook(@RequestParam("titlefromView") String titleToDelete, Model model) {
		//The request is from library
		//Usually use the id, not the title
		//titleToDelete variable que usaré en este método (ámbito- Llaves)
		//Call service

		System.out.println(titleToDelete);
		
		service.queryDeleteBook(titleToDelete);
		
		//model.addAttribute("booksfromController", service.library);
		
		
		return "bookDeleted";
	}
	
	@RequestMapping("/detailbook")
	public String detailsBook(@RequestParam("titlefromView") String titleToDetailed, Model model) {
		
		Book bookToReturn = service.queryDetailBook(titleToDetailed);
		
		model.addAttribute("book", bookToReturn);
		
		
		return "bookDetail";
	}

}
