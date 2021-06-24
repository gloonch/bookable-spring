package com.secondmonth.bookable.modules.books.controller;

import com.secondmonth.bookable.modules.books.model.Books;
import com.secondmonth.bookable.modules.books.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BooksController {

    BooksService booksService;

    @Autowired
    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public @ResponseBody
    List<Books> getBooks() {
        return booksService.findAll();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public @ResponseBody
    Books registerBook(Books books) {
        return booksService.registerBook(books);
    }

}
