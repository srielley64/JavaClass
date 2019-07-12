package com.rielley.bookvalidator.service;

import com.rielley.bookvalidator.model.Book;
import com.rielley.bookvalidator.repository.BookValidationRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BookValidationService {

  private BookValidationRepository bookValidationRepository;

  @Autowired
  public BookValidationService(BookValidationRepository bookValidationRepository) {
    this.bookValidationRepository=bookValidationRepository;
  }

  public Page<Book> findAll(Pageable pageable) {
    return bookValidationRepository.findAll(pageable);
  }

  public Book save(Book book) {
    return bookValidationRepository.save(book);
  }

  public Optional<Book> findById(Integer id) {
    return bookValidationRepository.findById(id);
  }
}
