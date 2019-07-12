package com.rielley.bookvalidator.controller;

import com.rielley.bookvalidator.model.Book;
import com.rielley.bookvalidator.service.BookValidatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



@Controller
@RequestMapping("/booklist")
public class BookValidatorController {

  private BookValidatorService bookValidatorService;

  @Autowired
  public BookValidatorController(BookValidatorService bookValidatorService) {
    this.bookValidatorService = bookValidatorService;
  }

  @GetMapping("/")
  public String welcome(Model model) {
    return "booklist/welcome";
  }

  @GetMapping("/new")
  public String addBook(Model model) {
    model.addAttribute(new Book());
    return "/booklist/addbook";
  }

  @PostMapping("/add")
  public String processAdding(@ModelAttribute("book") Book book, Model model,
      BindingResult results, RedirectAttributes ra) {
    if (results.hasErrors()) {
      return "/booklist/addbook";
    }
    bookValidatorService.save(book);
    ra.addFlashAttribute("book", book);
    return "redirect:/booklist/book";
  }

  @GetMapping("/booklist/book")
  public String viewBook(@ModelAttribute("book") Book book, Model model) {
    model.addAttribute("book", book);
    return "/booklist/viewBook";
  }
}
