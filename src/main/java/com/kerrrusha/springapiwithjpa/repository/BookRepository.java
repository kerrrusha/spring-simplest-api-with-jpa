package com.kerrrusha.springapiwithjpa.repository;

import com.kerrrusha.springapiwithjpa.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
