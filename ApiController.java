package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.Bookservice;

@RestController

public class ApiController {
	
	@Autowired
	Bookservice bs;
	
	@PostMapping("addbike")
	public Book add(@RequestBody Book ss) {		
		return bs.saveinfo(ss);
	}
	
	@PostMapping("addnbike")
	public List<Book> addndetails(@RequestBody List<Book> ss)
	{
		return bs.savedetails(ss);
	}
	@GetMapping("showdetails")
	public List<Book> show()
	{
		return bs.showinfo();
	}
	
	@GetMapping("year/{year}")
	public 	List<Book> showstudetails(@PathVariable int year)
	{
		return bs.getbike(year);
	}
	
	@GetMapping("year/{year}/bikename/{bikename}")
	public 	List<Book> showstudetails(@PathVariable int year,@PathVariable String bikename)
	{
		return bs.getbiketypes(year, bikename);
	}

}
