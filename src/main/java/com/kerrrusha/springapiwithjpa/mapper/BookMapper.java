package com.kerrrusha.springapiwithjpa.mapper;

import com.kerrrusha.springapiwithjpa.dto.BookRequestDto;
import com.kerrrusha.springapiwithjpa.model.Book;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    public Book toModel(BookRequestDto bookRequestDto) {
        Book book = new Book();
        book.setTitle(bookRequestDto.getTitle());
        book.setPrice(bookRequestDto.getPrice());
        return book;
    }
}
