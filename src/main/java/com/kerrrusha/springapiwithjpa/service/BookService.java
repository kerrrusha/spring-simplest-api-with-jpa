package com.kerrrusha.springapiwithjpa.service;

import com.kerrrusha.springapiwithjpa.dto.BookRequestDto;
import com.kerrrusha.springapiwithjpa.model.Book;

import java.util.List;

public interface BookService {
    Book save(BookRequestDto bookRequestDto);

    List<Book> findAll();
}
