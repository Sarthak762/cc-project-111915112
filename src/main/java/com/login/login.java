package com.login;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.dao.AuthDao;


@WebServlet("/Login")
public class Login extends HttpServlet {



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String employee_id=request.getParameter("employee-id");
        String pass=request.getParameter("password");

        System.out.println(employee_id);
        AuthDao dao= new AuthDao();
            if(dao.check(employee_id, pass))
            {
                HttpSession session=  request.getSession();
                session.setAttribute("employee_id", employee_id);
                response.sendRedirect("report.jsp");
            }
            else
            {

                response.sendRedirect("login.jsp");
            }
    }
}
