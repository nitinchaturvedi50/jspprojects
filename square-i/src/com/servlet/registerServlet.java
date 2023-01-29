package com.servlet;




import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CredentialDAO;


@WebServlet("/registerServlet")
public class registerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			String username=request.getParameter("username");
			String email=request.getParameter("email");
			
			String phone=request.getParameter("phonenumber");
			String possible=request.getParameter("possibledateforvisit");
			String subject=request.getParameter("subject");
			String additionalmessage=request.getParameter("additionalmessage");
			
			model.Credential obj=new model.Credential();
			obj.setUsername(username);
			obj.setEmail(email);
			
			obj.setPhonenumber(phone);
			obj.setPossibledateforvisit(possible);
			obj.setSubject(subject);
			obj.setAdditionalmessage(additionalmessage);
			
			try {
			CredentialDAO objDAO=new CredentialDAO();
			objDAO.insertCredential(obj);
			}
			catch(Exception e)
			{out.println("Exception Arised:"+e);
			}
			response.sendRedirect("index.jsp");

	}

}
