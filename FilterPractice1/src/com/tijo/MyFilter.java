package com.tijo;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {

	FilterConfig conf;
	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		String value = conf.getInitParameter("construction");
		if(value.equals("no"))
		{
			arg1.getWriter().println("Page is under construction");
		}else
		{
			arg2.doFilter(arg0, arg1);
		}
	}
	@Override
	public void init(FilterConfig arg0) throws ServletException {
	
		this.conf = arg0;
	}

	

}
