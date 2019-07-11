package com.launchacademy.booklist.mapper;

import com.launchacademy.booklist.dto.BookDto;
import com.launchacademy.booklist.model.Book;
import org.mapstruct.Mapper;

@Mapper
public interface BookToBookDtoMapper {
  BookDto sourceToDestination(Book book);
  Book destinationToSource(BookDto dto);
}
