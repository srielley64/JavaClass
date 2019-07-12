package com.launchacademy.booklist.dto;

import java.io.IOException;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Name {

  private String firstName;
  private String middleName;
  private String lastName;
  private String nickName;

  @Override
  public String toString() {
    return "Name{" +
        "firstName='" + firstName + '\'' +
        ", middleName='" + middleName + '\'' +
        ", nickName='" + nickName + '\'' +
        ", lastName='" + lastName + '\'' +
        '}';
  }

  private void writeObject(java.io.ObjectOutputStream out)
      throws IOException {
    out.writeUTF(firstName);
    out.writeUTF(middleName);
    out.writeUTF(nickName);
    out.writeUTF(lastName);
  }
}
