package com.kerrrusha.springapiwithjpa.service.impl;

import com.kerrrusha.springapiwithjpa.dto.BookRequestDto;
import com.kerrrusha.springapiwithjpa.mapper.BookMapper;
import com.kerrrusha.springapiwithjpa.model.Book;
import com.kerrrusha.springapiwithjpa.repository.BookRepository;
import com.kerrrusha.springapiwithjpa.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Override
    public Book save(BookRequestDto bookRequestDto) {
        Book book = bookMapper.toModel(bookRequestDto);
        return bookRepository.save(book);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
