package com.launchacademy.booklist.model;

import java.util.Date;
import java.util.List;
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
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="author")
public class Author {

  @Id
  @SequenceGenerator(name="author_generator", sequenceName="author_id_seq", allocationSize = 1)
  @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="author_generator")
  @Column(name="id", nullable=false, unique=true)
  private long id;

  @NonNull
  @NotNull
  @Column(name="first_name", length=20)
  private String firstName;

  @NonNull
  @NotNull
  @Column(name="middle_name", length=20)
  private String middleName;

  @NonNull
  @NotNull
  @Column(name="last_name", length=20)
  private String lastName;

  @NotNull
  @NonNull
  @Column(name="nick_name", length=20)
  private String nickName;

  @NotNull
  @NonNull
  @Temporal(TemporalType.DATE)
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date born;

  @Temporal(TemporalType.DATE)
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date died;

  @OneToMany(mappedBy="id")
  private List<Book> bookList;

}
