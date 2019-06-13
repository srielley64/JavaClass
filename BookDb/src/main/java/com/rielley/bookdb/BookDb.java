package com.rielley.bookdb;

import com.rielley.bookdb.model.Author;
import com.rielley.bookdb.model.Book;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class BookDb {

  private EntityManagerFactory entityManagerFactory;
  private EntityManager entityManager;
  private List<Book> bookList;
  private List<Author> authorList;

  private String AUTHOR_QUERY_STR = "SELECT Author a WHERE a.first_name = :firstName and a.last_name = :lastName";
  private Query authorQuery;

  private String BOOK_JOIN_STR = "SELECT a FROM Author a JOIN Book b ON a.id = b.author";
  private Query bookJoin;

  public BookDb() {
    entityManagerFactory= Persistence.createEntityManagerFactory("BookDb");
    entityManager = entityManagerFactory.createEntityManager();
    bookList = new ArrayList<>();
    authorList = new ArrayList<>();
  }

  private int load() {
    entityManager.getTransaction().begin();
    Book book = new Book("On Baskilisk Station", entityManager.find(Author.class, 1L));
    entityManager.persist(book);
    entityManager.getTransaction().commit();
    return 1;
  }

  private List<Author> joinBookAuthor() {
    entityManager.getTransaction().begin();
    bookJoin = entityManager.createQuery(BOOK_JOIN_STR);
    List<Author> books =  bookJoin.getResultList();
    entityManager.getTransaction().commit();
    return books;
  }
  public static void main(String[] args) {
    BookDb books = new BookDb();
    books.load();
    List<Author> bookList = books.joinBookAuthor();
    for (Author author : bookList) {
      System.out.println(author);
    }
  }
}
