package com.gosang.entity;

import lombok.Data;

/**
 * @author gosang
 * @version 1.0
 * @date 2020/8/15 16:37
 */
@Data
public class Book {
    private Integer bno;
    private String name;
    private String author;
    private Double price;
    private Integer quantity;

}
