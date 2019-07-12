package com.launchacademy.booklist.dto;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BookDto implements Serializable {
  private static final long serialVersionUID = 20190709080300L;
  private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

  private long id;

  @NonNull
  private String title;

  @NonNull
  private AuthorDto author;

  @NonNull
  private Date copyright;

  private int mode;

  private Date start;

  private Date finish;

}
