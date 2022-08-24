package com.lucumt;

import com.lucumt.model.BookModel;
import com.lucumt.service.BookService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestBookService {

    @Autowired
    private BookService bookService;

    @Test
    public void testDeleteUser() {
        BookModel book = bookService.getBook(3);
        System.out.println(book);
    }

    @Test
    public void testSelectByType() {
        List<BookModel> bookList = bookService.selectByType(3);
        Assertions.assertTrue(bookList != null);
        Assertions.assertTrue(bookList.size() == 0);
    }
}
