package com.rielley.booklist.services;

import com.rielley.booklist.models.Book;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class BooklistBasedServer {

  private List<Book> bookList = new ArrayList<>();
  private SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd");

  public List<Book> getBookList() {
    return bookList;
  }

  public BooklistBasedServer() {
    Date cr = null;
    try {
      cr = sdFormat.parse("1992-04-01");
      Book book = new Book("On Baskilik Station", "David Weber", cr);
      bookList.add(book);
      cr = sdFormat.parse("2010-06-24");
      book = new Book("The Passage", "Josh Cronin", cr);
      bookList.add(book);
      cr=sdFormat.parse("1993-01-01");
      book = new Book("The Honor of the Queen", "David Weber", cr);
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }
}