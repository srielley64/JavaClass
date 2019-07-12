package com.launchacademy.booklist.controller;

import com.launchacademy.booklist.service.BookListService;
import com.launchacademy.booklist.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookListController {

  @Autowired
  private BookListService booklistService;

  @GetMapping(value = {"/","/new"})
  public String newBook(Model model) {
    Book book = new Book();
    model.addAttribute("book", book);
    return "addBook";
  }

  @PostMapping("add")
  public String addBook(Model model) {
    Book book=new Book();
    System.out.println("Entering addBook");
    if (model.containsAttribute("book")) {
      book = (Book)model.asMap().get("book");
      booklistService.save(book);
    }
    model.addAttribute("bookId", book.getId());
    return "/index";
  }

//  @GetMapping("/book")
//  public String showBook(Model model) {
//    System.out.println(model.containsAttribute("bookId"));
//    return "/index";
//  }
}
