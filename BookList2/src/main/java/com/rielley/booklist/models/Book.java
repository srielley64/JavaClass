package com.rielley.booklist.models;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
public class Book {
  private String title;
  private String author;

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date copyright;

  public Book() { }

  public Book(String title, String author, Date copyright) {
    this.title = title;
    this.author = author;
    this.copyright = copyright;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Date getCopyright() {
    return copyright;
  }

  public void setCopyright(Date copyright) {
    this.copyright = copyright;
  }

  @Override
  public String toString() {
    return "Book{" +
        "title='" + title + '\'' +
        ", author='" + author + '\'' +
        ", copyright=" + copyright +
        '}';
  }
}
