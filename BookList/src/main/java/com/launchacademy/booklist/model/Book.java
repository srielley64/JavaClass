package com.launchacademy.booklist.model;

import java.util.Date;

public class Book {
  private int id;
  private String title;
  private String author;
  private Date copyright;
  private int numberOfPages;

  public Book() {}

  public Book(int id, String title, String author, Date copyright, int numberOfPages) {
    this.id = id;
    this.title = title;
    this.author = author;
    this.copyright = copyright;
    this.numberOfPages = numberOfPages;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
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

  public int getNumberOfPages() {
    return numberOfPages;
  }

  public void setNumberOfPages(int numberOfPages) {
    this.numberOfPages = numberOfPages;
  }

  @Override
  public String toString() {
    return "Book{" +
        "title='" + title + '\'' +
        ", author='" + author + '\'' +
        ", copyright=" + copyright +
        ", numberOfPages=" + numberOfPages +
        '}';
  }
}
