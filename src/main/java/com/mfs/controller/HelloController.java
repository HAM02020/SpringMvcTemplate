package com.mfs.controller;

import com.mfs.dao.BookDao;
import com.mfs.entity.Book;
import com.mfs.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping(value = "/redirect")
    public String sendredirect(){
        return "redirect:/";
    }
    @RequestMapping(value = "/hello")
    @ResponseBody
    public String sayhello(){
        return "hello";
    }


    @Autowired
    private BookDao bookDao;

    @RequestMapping(value = "/books")
    @ResponseBody
    public String testQueryById() throws Exception {
        long bookId = 1000;
        Book book = bookDao.queryById(bookId);
        return book.toString();
    }

}
