package com.lauchacademy.gadgets;

import com.lauchacademy.gadgets.model.Gadget;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/gadgets", "/gadgets/new"})
public class GadgetsController extends HttpServlet {

  private GadgetsServer gadgetsServer = new GadgetsServer();

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    System.out.println("doGet()");
    System.out.println(req.getServletPath());
    String path = req.getServletPath();
    if (path.equals("/gadgets/new")) {
      RequestDispatcher dispatcher = req.getRequestDispatcher("/gadgets/addGadget.jsp");
      dispatcher.forward(req, resp);
    } else {
      System.out.println("ERROR - doGet()");
      resp.sendError(HttpServletResponse.SC_NOT_FOUND);
    }
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    System.out.println("doPost()");
    System.out.println(req.getServletPath());
    resp.setContentType("text/html");
    if (req.getServletPath().equals("/gadgets")) {
      String sId = req.getParameter("id");
      String name = req.getParameter("name");
      String description = req.getParameter("description");
      System.out.println(sId + name + description);
      if (sId!=null && !sId.isBlank() && name!=null &&
          !name.isBlank() && description!=null && !description.isBlank()) {
        Gadget gad = new Gadget(Integer.parseInt(sId), name, description);
        gadgetsServer.add(gad);
        req.setAttribute("gadgetList", gadgetsServer.getGadgetList());
      }
      RequestDispatcher dispatcher = req.getRequestDispatcher(
          "/gadgets/gadget.jsp");
      dispatcher.forward(req, resp);
    } else {
      System.out.println("ERROR - doPut()");
      resp.sendError(HttpServletResponse.SC_NOT_FOUND);
    }
  }
}