package com.secondmonth.bookable.modules.books.service;

import com.secondmonth.bookable.modules.books.model.Books;
import com.secondmonth.bookable.modules.books.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {

    BooksRepository booksRepository;

    @Autowired
    public BooksService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public List<Books> findAll() {
        return booksRepository.findAll();
    }

    public Books registerBook(Books books) {
        return booksRepository.save(books);
    }
}
