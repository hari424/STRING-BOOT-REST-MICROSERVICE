package com.nt.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.BookEntity;

public interface BookRepository  extends  JpaRepository<BookEntity, Serializable>{

}
