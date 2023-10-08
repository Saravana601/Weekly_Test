package com.geekster.StudentPortal.repository;

import com.geekster.StudentPortal.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book,Long> {
}
