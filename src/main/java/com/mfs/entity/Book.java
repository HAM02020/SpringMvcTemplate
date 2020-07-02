package com.mfs.entity;

public class Book {

    private long bookId;// 图书ID

    private String name;// 图书名称

    private int number;// 馆藏数量

    // 省略构造方法，getter和setter方法，toString方法

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}