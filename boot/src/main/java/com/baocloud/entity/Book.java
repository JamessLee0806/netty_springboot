package com.baocloud.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
public class Book implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String reader;
	private String isbn;
	private String title;
	private String author;
	private String description;
}
