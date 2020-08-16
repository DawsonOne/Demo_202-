package com.gosang.service;

import com.gosang.entity.Book;

import java.util.List;

/**
 * @author gosang
 * @version 1.0
 * @date 2020/8/15 16:43
 */
public interface BookService {
    List<Book> findAll();
}
