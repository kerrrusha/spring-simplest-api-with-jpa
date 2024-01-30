package com.kerrrusha.springapiwithjpa.controller;

import com.kerrrusha.springapiwithjpa.dto.BookRequestDto;
import com.kerrrusha.springapiwithjpa.model.Book;
import com.kerrrusha.springapiwithjpa.service.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/book")
public class BookController {
    private final BookService bookService;

    @GetMapping("/get")
    public List<Book> findAll() {
        log.info("Find all");
        return bookService.findAll();
    }

    @PostMapping("/save")
    public Book save(@RequestBody BookRequestDto bookRequestDto) {
        log.info("Save: {}", bookRequestDto);
        return bookService.save(bookRequestDto);
    }
}
