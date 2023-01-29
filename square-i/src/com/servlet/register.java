package com.servlet;




import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CredentiaDAO;



@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			String firstname=request.getParameter("firstname");
			String laststname=request.getParameter("Laststname");
			
			String email=request.getParameter("email");
			String phone=request.getParameter("phone");
			String comment=request.getParameter("comment");
			
			model.Credentia obj=new model.Credentia();
			obj.setFirstname(firstname);
			obj.setLaststname(laststname);
			
			obj.setEmail(email);
			obj.setPhone(phone);
			obj.setComment(comment);
			
			
			try {
			CredentiaDAO objDAO=new CredentiaDAO();
			objDAO.insertCredentia(obj);
			}
			catch(Exception e)
			{out.println("Exception Arised:"+e);
			}
			out.println(firstname);
			out.println(laststname);
			out.println(email);
	out.println(phone);
	out.println(comment);
	out.println("Submit");
	response.sendRedirect("index.jsp");
	}

}
