package com.launchacademy.booklist.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

@Configuration
@ComponentScan(basePackages = {
    "com.launchacademy.booklist.controller",
    "com.launchacademy.booklist.repository",
//    "com.launchacademy.booklist.service",
    "com.launchacademy.booklist.model"})
public class BookListConfiguration {

//  @Bean
//  public LocaleResolver localeResolver() {
//    SessionLocaleResolver slr = new SessionLocaleResolver();
//    slr.setDefaultLocale(Locale.US);
//    return slr;
//  }
//
//  @Bean
//  public LocaleChangeInterceptor localeChangeInterceptor() {
//    LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
//    lci.setParamName("lang");
//    return lci;
//  }

  @Bean
  public MethodValidationPostProcessor methodValidationPostProcessor() {
    return new MethodValidationPostProcessor();
  }
}
