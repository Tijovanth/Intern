package com.tijo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.urlfetch.HTTPResponse;
import com.google.appengine.api.urlfetch.URLFetchService;
import com.google.appengine.api.urlfetch.URLFetchServiceFactory;

public class HelloAppEngine extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {
	  URLFetchService fetch = URLFetchServiceFactory.getURLFetchService();
	  URL url = new URL("https://quick-nexus-259109.appspot.com/hello");
	  try {
	  HTTPResponse res = fetch.fetch(url);
	  response.setContentType("text/html");
	  response.getWriter().println(res.getResponseCode());
	  response.getWriter().println(res.getFinalUrl());
	  response.getWriter().println(res.getContent());
	  }catch(Exception e)
	  {
		  response.getWriter().println("Sorry Time Out");
	  }
	  BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
	  StringBuffer json = new StringBuffer();
	  String line;

	  while ((line = reader.readLine()) != null) {
	    json.append(line);
	  }
	  reader.close();
	  response.getWriter().println(json);
  }
}