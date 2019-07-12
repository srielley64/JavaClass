package com.launchacademy.booklist.mapper;

import com.launchacademy.booklist.dto.Name;

public class NameMapper {

  public String asString(Name name) {
    StringBuilder sb = new StringBuilder();
    if (!name.getFirstName().isBlank()) {
      sb.append(name.getFirstName());
    }
    if (!name.getMiddleName().isBlank()) {
      sb.append(' ');
      sb.append(name.getMiddleName());
    }
    if (!name.getNickName().isBlank()) {
      sb.append(' ');
      sb.append(name.getNickName());
    }
    if (!name.getLastName().isBlank()) {
      sb.append(' ');
      sb.append(name.getLastName());
    }
    return sb.toString();
  }

  public Name asName(String name) {
    String[] parsed = name.split("\b");
    Name tName = new Name();
    if (!parsed[0].isBlank()) {
      tName.setFirstName(parsed[0]);
    }
    if (!parsed[1].isBlank()) {
      tName.setMiddleName(parsed[1]);
    }
    if (!parsed[2].isBlank()) {
      tName.setNickName(parsed[2]);
    }
    if (!parsed[3].isBlank()) {
      tName.setLastName(parsed[3]);
    }
    return tName;
  }
}
