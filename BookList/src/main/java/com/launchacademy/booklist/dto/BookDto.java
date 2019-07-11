package com.launchacademy.booklist.dto;

import java.io.Serializable;
import java.text.SimpleDateFormat;

@Getter @Setter @
public class BookListDto implements Serializable {
  private static final long serialVersionUID = 20190709080300L;
  private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

  private String title;
  private String author;
  private String copyright;

}
