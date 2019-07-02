package com.launchacademy.pets.config;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class MvcConfiguration implements WebMvcConfigurer {

  private static final SimpleDateFormat simpleDateFormat =
      new SimpleDateFormat("yyyy-MM-dd");

  @Override
  public void addFormatters(FormatterRegistry registry) {
    registry.addConverter(
        new Converter<String, Date>() {

          public Date convert(String text) {
            try {
              return simpleDateFormat.parse(text);
            } catch (ParseException pe) {
              pe.printStackTrace();
              return (new Date());
            }
          }
        });
    registry.addConverter(
        new Converter<Date, String>() {
          @Override
          public String convert(Date date) {
            return simpleDateFormat.format(date);
          }
        });
  }
}
