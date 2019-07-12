package com.launchacademy.booklistdb.repository;

import com.launchacademy.booklistdb.model.Book;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public class BookServiceImpl implements BookService {

  @Autowired
  private BookRespository bookRespository;

  @Override
  public Book save(Book book) {
    return bookRespository.save(book);
  }

  @Override
  public Book findByTitle(String title) {
    return bookRespository.findByTitle(title);
  }

  @Override
  public List<Book> findByAuthor(String author) {
    return bookRespository.findByAuthor(author);
  }

  @Override
  public List<Book> findByCopyright(Date date) {
    return bookRespository.findByCopyright(date);
  }
}
