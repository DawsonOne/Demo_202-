package com.gosang.service.impl;

import com.gosang.entity.Book;
import com.gosang.mapper.BookMapper;
import com.gosang.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author gosang
 * @version 1.0
 * @date 2020/8/15 16:44
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> findAll() {
        return bookMapper.findAll();
    }
}
