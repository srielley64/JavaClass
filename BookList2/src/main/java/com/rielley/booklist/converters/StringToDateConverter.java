package com.rielley.booklist.converters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.core.convert.converter.Converter;

public class StringToDateConverter implements Converter<String, Date> {

  private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

  @Override
  public Date convert(String s) {

    try {
      return simpleDateFormat.parse(s);
    } catch (ParseException e) {
        e.getMessage();
        return new Date();
    }
  }
}
