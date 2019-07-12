package com.launchacademy.booklist.dto;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Getter
@Setter
@NoArgsConstructor
public class AuthorDto implements Serializable {

  private static final long serialVersionUID = 20190709163030L;

  @NonNull
  private long id;

  @NonNull
  private Name authorName;

  @NonNull
  private Date born;

  private Date died;

  @Override
  public String toString() {
    return "AuthorDto{" +
        "id=" + id +
        ", authorName='" + authorName + '\'' +
        ", born=" + born +
        ", died=" + died +
        '}';
  }

  private void writeObject(java.io.ObjectOutputStream out)
      throws IOException {
    out.writeLong(id);
    if (born != null) {
      out.writeLong(born.getDate());
    }
    if (died != null) {
      out.writeLong(died.getDate());
    }
  }
}
