package com.rielley.bookvalidator.controller;

import com.rielley.bookvalidator.service.BookValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
}
