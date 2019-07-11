package com.launchacademy.bakery;

import com.launchacademy.bakery.model.Order;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/bakery/new", "/bakery", "/bakery/list", "/bakery/remove"})
public class BakeryController extends HttpServlet {

  private static final OrderServer orderServer = new OrderServer();

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    String path = req.getServletPath();
    RequestDispatcher dispatcher;
    if (path.equals("/bakery/new")) {
      HttpSession session = req.getSession();
      String userName = (String)session.getAttribute("userName");
      if (userName == null) {
        session.setAttribute("userName", "none");
      }
      dispatcher = req.getRequestDispatcher("/bakery/addOrder.jsp");
      dispatcher.forward(req, resp);
    } else if (path.equals("bakery/list")) {
      dispatcher = req.getRequestDispatcher("/bakery/listOrder.jsp");
      dispatcher.forward(req,resp);
    } else {
      resp.sendError(HttpServletResponse.SC_NOT_FOUND);
    }
  }

  @Override
  protected void doPut(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    String path = req.getServletPath();
    if (path.equals("/bakery")) {
      HttpSession session = req.getSession();
      String sIds = (String)session.getAttribute("orderIds");
      int orderId;
      if (sIds == null) {
        orderId = 1;
      } else {
        orderId = Integer.parseInt(sIds)+1;
      }
      session.setAttribute("orderIds", Integer.toString(orderId));
      String userName = req.getParameter("userName");
      String itemName = req.getParameter("itemName");
      int quantity = Integer.parseInt(req.getParameter("quantity"));
      boolean glutenFree = req.getParameter("glutenFree").equals("yes");
      boolean vegan = req.getParameter("vegan").equals("yes");
      Order order = new Order(orderId, userName, itemName, quantity, glutenFree, vegan);
      OrderServer.add(order);
    } else {
      resp.sendError(HttpServletResponse.SC_NOT_FOUND);
    }
  }
}
