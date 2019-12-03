package com.tijo;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.taskqueue.Queue;
import com.google.appengine.api.taskqueue.QueueFactory;
import com.google.appengine.api.taskqueue.TaskOptions;

public class HelloAppEngine extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {

	  String key = request.getParameter("key");
	  Queue queue =  (Queue) QueueFactory.getDefaultQueue();
	  queue.add(TaskOptions.Builder.withUrl("/worker").param("Key", key));
	  queue.add(TaskOptions.Builder.withUrl("/anotherworker").param("Key", key));
  }
}