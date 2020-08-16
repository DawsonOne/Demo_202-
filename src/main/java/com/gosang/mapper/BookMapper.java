package com.gosang.mapper;

import com.gosang.entity.Book;

import java.util.List;

/**
 * @author gosang
 * @version 1.0
 * @date 2020/8/15 16:41
 */
public interface BookMapper {
    List<Book> findAll();
}
