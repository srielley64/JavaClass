package com.launchacademy.booklist.service;

import com.launchacademy.booklist.model.Author;
import com.launchacademy.booklist.model.Book;
import com.launchacademy.booklist.repository.BookListRepository;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookListService {

  private BookListRepository bookListRepository;

  @Autowired
  public BookListService(BookListRepository repository) {
    bookListRepository = repository;
  }

  Iterable<Book> findAll() {
    return bookListRepository.findAll();
  }

  public List<Book> findAllByTitle(String title) {
    return bookListRepository.findAllByTitle(title);
  }

  public List<Book> findAllByAuthor(Author author) {
    return bookListRepository.findAllByAuthor(author);
  }

  public List<Book> findAllByCopyrightBetween(Date start, Date end) {
    return bookListRepository.findAllByCopyrightBetween(start, end);
  }

  public List<Book> findAllByMode(int status) {
    return bookListRepository.findAllByMode(status);
  }

  public <S extends Book> S save(S s) {
    return bookListRepository.save(s);
  }
}
