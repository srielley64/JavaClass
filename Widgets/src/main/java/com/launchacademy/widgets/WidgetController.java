package com.launchacademy.widgets;

import com.launchacademy.widgets.model.Widget;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/widgets", "/widgets/new", "/widgets/list",
    "/widgets/remove"})
public class WidgetController extends HttpServlet {

  private static WidgetServer widgetServer = new WidgetServer();

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    String path=req.getServletPath();
    System.out.println("doGet(): "+path);
    if (path.equals("/widgets/new")) {
      RequestDispatcher dispatcher = req.getRequestDispatcher("/widgets/addWidgets.jsp");
      dispatcher.forward(req, resp);
    } else if (path.equals("/widgets/list")) {
      req.setAttribute("widgets", widgetServer.getWidgetList());
      RequestDispatcher dispatcher = req.getRequestDispatcher("/widgets/listWidgets.jsp");
      dispatcher.forward(req, resp);
    } else {
      resp.sendError(HttpServletResponse.SC_NOT_FOUND);
    }
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    System.out.println("doPost(): "+req.getServletPath());

    if (req.getServletPath().equals("/widgets")) {
      HttpSession session = req.getSession();
      String sIds = (String)session.getAttribute("ids");
      int id;
      if (sIds == null) {
        id = 1;
      } else {
        id = Integer.parseInt(sIds)+1;
      }
      session.setAttribute("ids", Integer.toString(id));

//      int id = Integer.parseInt(req.getParameter("id"));
      String name = req.getParameter("name");
      int price = Integer.parseInt(req.getParameter("price"));
      String descript = req.getParameter("description");
      Widget widget = new Widget(id, name, price, descript);
      widgetServer.add(widget);
      req.setAttribute("widget", widget);
      RequestDispatcher dispatcher = req.getRequestDispatcher("/widgets/widget.jsp");
      dispatcher.forward(req, resp);
    } else {
      resp.sendError(HttpServletResponse.SC_NOT_FOUND);
    }
  }
}
