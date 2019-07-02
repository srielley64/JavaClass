package com.rielley.booklist.controllers;

import com.rielley.booklist.repositories.BooklistServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BooklistController {

  @Value("${welcome.message}")
  private String message;

  @Autowired
  private BooklistServer bookList;

  @GetMapping("/")
  public String main(Model model) {
    return "welcome";
  }

  // /hello?name=Steve
  @GetMapping("/hello")
  public String mainWithParam(
      @RequestParam(name="name", required=false, defaultValue="")
      String name, Model model) {
    model.addAttribute("message", name);
    model.addAttribute("bookList", bookList.getBookList());
    return "welcome";
  }
}
