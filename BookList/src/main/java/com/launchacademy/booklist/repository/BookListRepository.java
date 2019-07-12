package com.launchacademy.booklist.repository;

import com.launchacademy.booklist.model.Author;
import com.launchacademy.booklist.model.Book;
import java.util.Date;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookListRepository extends CrudRepository<Book, Long> {

  List<Book> findAllByTitle(String title);
  List<Book> findAllByAuthor(Author author);
  List<Book> findAllByCopyrightBetween(Date start, Date end);
  List<Book> findAllByMode(int status);

}
