package com.lucumt.service;

import com.lucumt.mapper.BookMapper;
import com.lucumt.model.BookModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;

    public BookModel getBook(Integer id) {
        Optional<BookModel> result = bookMapper.findById(id);
        BookModel book = result.orElse(new BookModel());
        return book;
    }

    public List<BookModel> selectByType(Integer type){
        List<BookModel> bookList = bookMapper.selectByType(type);
        return bookList;
    }
}
