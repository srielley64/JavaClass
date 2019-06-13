package com.rielley.bookdb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="Book", uniqueConstraints = {@UniqueConstraint(columnNames = {"id"})})
public class Book {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  @Column(name="id", nullable=false, unique=true)
  private long id;

  private String title;

  @ManyToOne
  private Author author;

  public Book() {}

  public Book(String title, Author author) {
    this();
    setTitle(title);
    setAuthor(author);
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

  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }
}
