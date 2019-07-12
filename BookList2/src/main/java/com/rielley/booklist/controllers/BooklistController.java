package com.rielley.booklist.controllers;

import com.rielley.booklist.models.Book;
import com.rielley.booklist.services.BooklistBasedService;
import com.rielley.booklist.services.BooklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/books")
public class BooklistController {

  @Value("${welcome.message}")
  private String message;

  @Autowired
  private BooklistService bookList;

  // /hello?name=Steve
  @GetMapping("/")
  public String mainWithParam(
      @RequestParam(name="name", required=false, defaultValue="")
      String name, Model model) {
    model.addAttribute("message", name);
    model.addAttribute("bookList", bookList.getList());
    return "listBooks";
  }

  @PostMapping
  public String addBook(@ModelAttribute Book book, Model model) {
    model.addAttribute(book);
    return ("redirect:/books");
  }
}
