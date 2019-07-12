package com.rielley.bookdb.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="Book")
public class Book {

  @Id
  @SequenceGenerator(name="book_generator", sequenceName = "book_id_seq", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_generator")
  private Long id;

  private String title;
  private String author;

  @Column(name="copyright-date")
  private Date copyrightDate;
  private String isbn;
  private int numberOfPages;

  public Book(String title, String author, Date copyrightDate, String isbn, int numberOfPages) {
    this.title = title;
    this.author = author;
    this.copyrightDate = copyrightDate;
    this.isbn = isbn;
    this.numberOfPages = numberOfPages;
  }

  public long getId() {
    return id;
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

  public Date getCopyrightDate() {
    return copyrightDate;
  }

  public void setCopyrightDate(Date copyrightDate) {
    this.copyrightDate = copyrightDate;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public int getNumberOfPages() {
    return numberOfPages;
  }

  public void setNumberOfPages(int numberOfPages) {
    this.numberOfPages = numberOfPages;
  }
}
