package com.rielley.bookdb.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="Author", uniqueConstraints = {@UniqueConstraint(columnNames = {"id"})})
public class Author {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  @Column(name="id", nullable=false, unique=true)
  private long id;

  @Column(name="first_name")
  private String firstName;

  @Column(name="last_name")
  private String lastName;


  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<Book> books = new HashSet<>();

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Set<Book> getBooks() {
    return books;
  }

  public void setBooks(Set<Book> books) {
    this.books = books;
  }

  @Override
  public String toString() {
    return "Author{" +
        "id=" + id +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", books=" + books +
        '}';
  }
}
