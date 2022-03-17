package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.dao.AuthDao;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		 AuthDao dao= new AuthDao();
         if(dao.check(username, password))
         {
             HttpSession session=  req.getSession();
             session.setAttribute("username", username);
             res.sendRedirect("welcome.jsp");
         }
         else
         {
             res.sendRedirect("login.jsp");
         }
		
	}
}
