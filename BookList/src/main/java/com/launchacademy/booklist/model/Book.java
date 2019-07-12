package com.launchacademy.booklist.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
@Table(name="book")
public class Book {

  @Id
  @SequenceGenerator(name="book_generator", sequenceName="book_id_seq", allocationSize = 1)
  @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="book_generator")
  @Column(name="id", nullable=false, unique=true)
  private long id;

  @NotNull
  @NonNull
  @Column(nullable = false)
  private String title;

  @NotNull
  @NonNull
  @ManyToOne(targetEntity = Author.class)
  private Author author;

  @NotNull
  @NonNull
  @Column(nullable = false)
  @Temporal(TemporalType.DATE)
  @DateTimeFormat(pattern="yyyy-MM-dd")
  private Date copyright;

  @Column(nullable = false)
  private int mode;

  @Column(nullable = true)
  @Temporal(TemporalType.DATE)
  @DateTimeFormat(pattern="yyyy-MM-dd")
  private Date start;

  @Column(nullable = true)
  @Temporal(TemporalType.DATE)
  @DateTimeFormat(pattern="yyyy-MM-dd")
  private Date finish;

}
