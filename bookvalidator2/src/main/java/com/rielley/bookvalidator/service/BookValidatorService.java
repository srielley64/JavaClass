package com.rielley.bookvalidator.service;

import com.rielley.bookvalidator.model.Book;
import com.rielley.bookvalidator.repository.BookValidatorRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookValidatorService {

  private BookValidatorRepository bookValidatorRepository;

  @Autowired
  public BookValidatorService( BookValidatorRepository bookValidatorRepository) {
    this.bookValidatorRepository = bookValidatorRepository;
  }

  public List<Book> findAll()  {
    List<Book> bookList = new ArrayList<>();
    for (Book book : (List<Book>)bookValidatorRepository.findAll()) {
      bookList.add(book);
    }
    return bookList;
  }

  public Book save(Book book) {
    return (Book)bookValidatorRepository.save(book);
  }

}
