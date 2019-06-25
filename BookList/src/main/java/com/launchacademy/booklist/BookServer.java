package com.launchacademy.booklist;

import com.launchacademy.booklist.model.Book;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Optional;

public class BookServer {

  private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

  public Optional<Book> getBook(int id) {
    try {
      switch (id) {
        case 1:
          return Optional
              .of(new Book(1, "On Baskilisk Station", "David Weber", format.parse("1994-06-01"),
                  343));
        case 2:
          return Optional.of(new Book(1, "Honor to the Queen", "David Weber", format.parse("2016-06-01"),
              433));
        case 3:
          return Optional.of(new Book(1, "The Passage", "Josh Cronin", format.parse("2016-04-01"),
              543));
      }
    } catch (ParseException p) {
      p.getMessage();
    }
    return Optional.empty();
  }


}
