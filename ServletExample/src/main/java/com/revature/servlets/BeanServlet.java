package com.revature.servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.revature.beans.beans;

public class BeanServlet extends HttpServlet {
	
	public Gson gson = new Gson();

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		beans bean = new beans();
		
		response.getWriter().append(gson.toJson(bean, beans.class));
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		beans b = gson.fromJson(request.getReader(), beans.class);
		
		System.out.println(b);
		
		response.getWriter().append(gson.toJson(b));
	}
}
