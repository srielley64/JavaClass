package com.rielley.booklist.services;

import com.rielley.booklist.models.Book;
import java.util.List;

public interface BooklistService {

  List<Book> getList();
  void addToList(Book book);
}
