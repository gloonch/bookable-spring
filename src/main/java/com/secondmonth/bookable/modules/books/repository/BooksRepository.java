package com.secondmonth.bookable.modules.books.repository;

import com.secondmonth.bookable.modules.books.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BooksRepository extends JpaRepository<Books, Long> {

    List<Books> findAllByReleaseDateOrderByReleaseDateAsc();

    //    TODO more filters on retrieving books

}
