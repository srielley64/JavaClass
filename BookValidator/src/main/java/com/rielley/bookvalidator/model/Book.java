package com.rielley.bookvalidator.model;

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
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name="book")
public class Book {

  @Id
  @SequenceGenerator(name="book_generator", sequenceName="book_id_seq", allocationSize = 1)
  @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="book_generator")
  private int id;

  @NotBlank
  @Size(max=150)
  @Column(length=150, nullable = false)
  private String title;

  @NotBlank
  @Size(max=100)
  @Column(length=100, nullable = false)
  private String author;

  @NotNull
  @Past
  @DateTimeFormat(iso = ISO.DATE)
  @Temporal(TemporalType.DATE)
  @Column(nullable = false)
  private Date copyright;

}
