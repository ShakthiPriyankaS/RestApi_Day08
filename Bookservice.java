package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.Bookrepo;

@Service
public class Bookservice {
	
	@Autowired
	Bookrepo br;
	
	public Book saveinfo(Book bk)
	{
		return br.save(bk);
	}
	
	public List<Book> savedetails(List<Book> bk){
		
		return (List<Book>)br.saveAll(bk);
	}
	public List<Book> showinfo()
	{
	      return br.findAll();
	}
	
	public List<Book> getbike(int s)
	{
		return br.getbikeInfo(s);
	}
	
	public List<Book> getbiketypes(int i,String s)
	{
		return br.getbikeInfobytypes(i, s);
	}

}
