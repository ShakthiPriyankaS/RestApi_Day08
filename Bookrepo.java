package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Book;

@Repository

public interface Bookrepo extends JpaRepository<Book, Integer> {
	
	@Query(value="select * from booktable where year=:year",nativeQuery=true)
	public List<Book> getbikeInfo(@Param("year") int year);
	
	@Query(value="select * from booktable where year=:year and bikename=:bikename",nativeQuery=true)
	public List<Book> getbikeInfobytypes(@Param("year") int year,@Param("bikename") String bikename);

}
