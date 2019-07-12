package com.launchacademy.booklistdb.repository;

import com.launchacademy.booklistdb.model.Book;
import java.util.Date;
import java.util.List;

public interface BookService {

  Book save(Book book);
  Book findByTitle(String title);
  List<Book> findByAuthor(String author);
  List<Book> findByCopyright(Date date);

}
