package com.tijo;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("Filter Config init Method");
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
	{
		
	}

	@Override
	public void destroy() {
		
	}
}
