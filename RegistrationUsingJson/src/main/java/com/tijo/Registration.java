package com.tijo;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

public class Registration extends HttpServlet {

	  public void doPost(HttpServletRequest request, HttpServletResponse response) 
		      throws IOException {
		  String line2 = "Tijo";
			String line = null;
			BufferedReader reader = request.getReader();
			while((line = reader.readLine()) != null)
				{
				line2 = line;
				System.out.println(line);
				}
			System.out.println(line2);
			try {
				JSONObject jsonObject = new JSONObject(line2);
				String num = jsonObject.get("num").toString();
				System.out.println(num);
				if(num.equals("1"))
				{
					String val = jsonObject.get("val").toString();
					if(!val.equals("Tijo"))
					{
						response.getWriter().println("Username is invalid");
					}
				}else
				{
					String val = jsonObject.get("val").toString();
					if(!val.equals("123"))
					{
						response.getWriter().println("Password is invalid");
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

	  }
}
