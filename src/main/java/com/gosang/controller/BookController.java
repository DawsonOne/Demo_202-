package com.gosang.controller;

import com.gosang.entity.Book;
import com.gosang.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author gosang
 * @version 1.0
 * @date 2020/8/15 16:45
 */
@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/findAll")
    public List<Book> findAllBooks(){
        return bookService.findAll();
    }
}
