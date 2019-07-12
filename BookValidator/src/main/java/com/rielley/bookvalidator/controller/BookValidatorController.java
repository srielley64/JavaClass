package com.rielley.bookvalidator.controller;

import com.rielley.bookvalidator.model.Book;
import com.rielley.bookvalidator.service.BookValidationService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/booklist")
public class BookValidatorController {

  private BookValidationService bookValidationService;

  @Autowired
  public BookValidatorController(BookValidationService bookValidationService) {
    this.bookValidationService = bookValidationService;
  }

  @GetMapping(value="/")
  public String welcome(Model model) {
    return "booklist/welcome";
  }

  @GetMapping(value="/new")
  public String bookList(Model model) {
    model.addAttribute("book", new Book());
    return "booklist/addBook";
  }

  @PostMapping(value="/add")
  public String newBook(@Valid @ModelAttribute Book book,
      BindingResult bindingResult, Model model, RedirectAttributes ra) {
    if (bindingResult.hasErrors()) {
      return "booklist/addBook";
    }
    bookValidationService.save(book);
    ra.addFlashAttribute("book", book);
    return "redirect:book";
  }

  @GetMapping(value="/list")
  public String listBooks(@RequestParam("page") int page, Model model) {
    Pageable pageable = PageRequest.of(page, 3);
    Page<Book> pager = bookValidationService.findAll(pageable);
    model.addAttribute("page", pager);
    return "booklist/index";
  }

  @GetMapping(value="/book")
  public String book(@ModelAttribute("book") Book book, Model model, RedirectAttributes ra) {
    model.addAttribute("book", book);
    return "booklist/book";
  }
}
