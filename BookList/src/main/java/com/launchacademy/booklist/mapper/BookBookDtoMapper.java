package com.launchacademy.booklist.mapper;

import com.launchacademy.booklist.dto.AuthorDto;
import com.launchacademy.booklist.dto.BookDto;
import com.launchacademy.booklist.dto.Name;
import com.launchacademy.booklist.model.Author;
import com.launchacademy.booklist.model.Book;
import org.mapstruct.Mapper;

@Mapper(uses={DateMapper.class, NameMapper.class})
public interface BookBookDtoMapper {

  BookDto bookDtoToBook(Book book);
  Book bookToBookDto(BookDto dto);

  AuthorDto authorToAuthorDto(Author author);
  Author authorDtoToAuthor(AuthorDto authorDto);

  Name stringToName( String name);
  String nameToString(Name name);

}
