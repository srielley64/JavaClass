package com.rielley.booklist.converters;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class DateToStringConverter implements Converter<Date,String> {

  private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
  @Override
  public String convert(Date source) {
    return simpleDateFormat.format(source);
  }
}
