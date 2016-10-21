package com.baocloud.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baocloud.entity.Book;

public interface ReadingListRepository extends JpaRepository<Book, Long> {
	List<Book> findByReader(String reader);
}
