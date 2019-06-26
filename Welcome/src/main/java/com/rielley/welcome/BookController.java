package com.rielley.welcome;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/book/list"})
public class BookController extends HttpServlet {

  private BookServer bookServer = new BookServer();

  private void processRequest(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {

    String bookId = req.getParameter("bookId");
    if (bookId != null) {
      int id = Integer.parseInt(bookId);
      bookServer.getBook(id).ifPresent(b -> req.setAttribute("bookRecord", b));
    }
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    processRequest(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    processRequest(req, resp);
  }
}
