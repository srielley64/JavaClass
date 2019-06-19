package model;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "author")
public class Author {

  @Id
  @SequenceGenerator(name = "author_generator", sequenceName = "author_id_seq", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_generator")
  @Column(name = "id", nullable = false, unique = true)
  protected long id;

  @Column(name="first_name", length=20)
  private String firstName;

  @Column(name="middle_name", nullable = true, length=20)
  private String middleName;

  @Column(name="last_name", length=20)
  private String lastName;

  @Temporal(TemporalType.DATE)
  @Column(name="date_birth")
  private Date dateBirth;

  @Temporal(TemporalType.DATE)
  @Column(name = "date_death", nullable = true)
  private Date dateDeath;

  @OneToMany( mappedBy = "authorId", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Book> bookList;

  public Author() {}

  public Author(String firstName, String middleName, String lastName, Date dateBirth,
      Date dateDeath) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.dateBirth = dateBirth;
    this.dateDeath = dateDeath;
  }

  public Author(String firstName, String middleName, String lastName, Date dateBirth,
      Date dateDeath, List<Book> bookList) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.dateBirth = dateBirth;
    this.dateDeath = dateDeath;
    this.bookList = bookList;
  }

  public long getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Date getDateBirth() {
    return dateBirth;
  }

  public void setDateBirth(Date dateBirth) {
    this.dateBirth = dateBirth;
  }

  public Date getDateDeath() {
    return dateDeath;
  }

  public void setDateDeath(Date dateDeath) {
    this.dateDeath = dateDeath;
  }

  public List<Book> getBookList() {
    return bookList;
  }

  public void setBookList(List<Book> bookList) {
    this.bookList = bookList;
  }

  @Override
  public String toString() {
    return "Author{" +
        "id=" + id +
        ", firstName='" + firstName + '\'' +
        ", middleName='" + middleName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", dateBirth=" + dateBirth +
        ", dateDeath=" + dateDeath +
        ", bookList=" + bookList +
        '}';
  }
}
