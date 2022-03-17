package com.signup;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.dao.AuthDao;
import com.signup.dao.SignupDaoDetail;
import com.signup.dao.SignupDaoSalary;

/**
 * Servlet implementation class Signup
 */
@WebServlet("/Signup")
public class Signup extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String employee_id = req.getParameter("employee_id");
		String password = req.getParameter("password");
		String first_name = req.getParameter("firstname");
		String Last_name = req.getParameter("lastname");
		String contact_num = req.getParameter("contact_num");
		String dob = req.getParameter("dob");
		String monthly_salary = req.getParameter("monthly_salary");
		String yearly_bonus = req.getParameter("yearly_bonus");
		String jobe_role = req.getParameter("job_role");
		System.out.println(employee_id);
		SignupDaoDetail dao= new SignupDaoDetail();
		SignupDaoSalary dao1= new SignupDaoSalary();
         if(dao.insert(employee_id,password,first_name,Last_name,dob,contact_num))
         {	
        	 dao1.insert(employee_id, jobe_role, monthly_salary, yearly_bonus);
             HttpSession session=  req.getSession();
             session.setAttribute("employee_id", employee_id);
             res.sendRedirect("login.jsp");
         }
         else
         {
             res.sendRedirect("signup.jsp");
         }
	}

}
