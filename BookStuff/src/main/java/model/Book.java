package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "book")
public class Book {

  @Id
  @SequenceGenerator(name="book_generator", sequenceName="book_id_seq", allocationSize = 1)
  @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="book_generator")
  @Column(name="id", nullable=false, unique=true)
  private Long id;

  @Column(name="author_id", nullable=false, insertable = false, updatable = false)
  private Long authorId;

  @ManyToOne
  @JoinColumn(name="author_id", nullable = false)
  Author author;

  @Column(length=100)
  private String title;

  @Column(length=13)
  private String isbn;

  @Temporal(TemporalType.DATE)
  @Column(name="copyright_date")
  private Date copyrightDate;


  public Book() {}

  public Book(Author author, String title, String isbn, Date copyrightDate) {
    this.author = author;
    this.title = title;
    this.isbn = isbn;
    this.copyrightDate = copyrightDate;
  }

  public Long getId() {
    return id;
  }

  public Long getAuthorId() {
    return authorId;
  }

  public void setAuthorId(Long authorId) {
    this.authorId = authorId;
  }

  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public Date getCopyrightDate() {
    return copyrightDate;
  }

  public void setCopyrightDate(Date copyrightDate) {
    this.copyrightDate = copyrightDate;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "Book{" +
        "id=" + id +
        ", authorId=" + authorId +
        ", author=" + author +
        ", title='" + title + '\'' +
        ", author=" + author +
        ", isbn='" + isbn + '\'' +
        ", copyrightDate=" + copyrightDate +
        '}';
  }
}
