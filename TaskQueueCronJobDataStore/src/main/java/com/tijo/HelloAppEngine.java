package com.tijo;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.taskqueue.Queue;
import com.google.appengine.api.taskqueue.QueueFactory;
import com.google.appengine.api.taskqueue.TaskOptions;

@WebServlet(
    name = "HelloAppEngine",
    urlPatterns = {"/hello"}
)
public class HelloAppEngine extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {
           String firstName = request.getParameter("fname");
           String lastName = request.getParameter("lname");
           Queue queue =  (Queue) QueueFactory.getQueue("insert");
           queue.add(TaskOptions.Builder.withUrl("/insert").param("firstName", firstName).param("lastName", lastName));
           response.sendRedirect("index.html");
  }
}