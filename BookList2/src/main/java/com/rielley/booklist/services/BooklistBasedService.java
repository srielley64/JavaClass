package com.rielley.booklist.services;

import com.rielley.booklist.models.Book;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class BooklistBasedService implements BooklistService {

  private List<Book> bookList = new ArrayList<>();

  public BooklistBasedService() {
    init();
  }

  private void init() {
    Date cr = null;
    SimpleDateFormat sdFormat =
        new SimpleDateFormat("yyyy-MM-dd");

    try {
      cr = sdFormat.parse("1992-04-01");
      Book book = new Book(
          "On Baskilik Station", "David Weber", cr);
      bookList.add(book);
      cr = sdFormat.parse("2010-06-24");
      book = new Book(
          "The Passage", "Josh Cronin", cr);
      bookList.add(book);
      cr=sdFormat.parse("1993-01-01");
      book = new Book(
          "The Honor of the Queen", "David Weber", cr);
    } catch (ParseException e) {
      e.printStackTrace();
    }

  }
  @Override
  public List<Book> getList() {
    return bookList;
  }

  @Override
  public void addToList(Book book) {
    bookList.add(book);
  }
}