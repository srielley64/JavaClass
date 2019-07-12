package com.launchacademy.booklistdb.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Book")
public class Book {

  @Id
  @SequenceGenerator(name="book_generator", sequenceName="book_id_seq", allocationSize = 1)
  @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="book_generator")
  @Column(name="id", nullable=false, unique=true)
  private long id;

  @NotNull
  @Column(nullable = false)
  private String title;

  @NotNull
  @Column(nullable = false)
  private String author;

  @NotNull
  @Column(nullable = false)
  @Temporal(TemporalType.DATE)
  private Date copyright;

  public Book() {
  }

  public Book(long id, String title, String author, Date copyright) {
    this.id = id;
    this.title = title;
    this.author = author;
    this.copyright = copyright;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
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

  @Override
  public String toString() {
    return "Book{" +
        "id=" + id +
        ", title='" + title + '\'' +
        ", author='" + author + '\'' +
        ", copyright=" + copyright +
        '}';
  }
}
