package com.rielley.bookvalidator.controller;

import com.rielley.bookvalidator.model.Book;
import com.rielley.bookvalidator.service.BookValidationService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booklist/api/v1")
public class RestBookValidatorController {

  private final BookValidationService bvService;

  @Autowired
  public RestBookValidatorController(BookValidationService service) {
    this.bvService = service;
  }

  @GetMapping(path = "/books", params={"page", "size"})
  public Page bookList(@RequestParam("page") int page, @RequestParam("size") int size) {
    Pageable pageable = PageRequest.of(page, size);
    return bvService.findAll(pageable);
  }

  @NoArgsConstructor
  private class BookNotFoundException extends RuntimeException {};

  @ControllerAdvice
  private class BookNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(BookNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String BookNotFoundHandler(BookNotFoundException ex) {
      return ex.getMessage();
    }
  }

  @GetMapping("books/{id}")
  public Book getOne(@PathVariable Integer id) {
    return bvService.findById(id).orElseThrow(() -> new BookNotFoundException());
  }

  @PostMapping("/books")
  public Book create(@RequestBody Book book) {
    return bvService.save(book);
  }
}
