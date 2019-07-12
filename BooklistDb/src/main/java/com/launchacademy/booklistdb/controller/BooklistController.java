package com.launchacademy.booklistdb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/booklist")
public class BooklistController {

  @GetMapping("/new")
  public String newBook( Model model) {

    return null;
  }

  @PostMapping("/form")
  public String processForm(Model model) {
    return null;
  }
}
