package com.signup.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SignupDaoSalary {
	String sql="insert into sarthakdubey_111915112_salary(Employee_ID, Job_Role, Monthly_Salary, Yearly_Bonus) values(?,?,?,?)";
    String url="jdbc:mysql://localhost:3306/AuthDatabase";
    public boolean insert(String employee_id,String jobe_role,String monthly_salary,String yearly_bonus) {
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,"root","admin1234");
        PreparedStatement st=con.prepareStatement(sql);
        st.setString(1, employee_id);
        st.setString(2,jobe_role);
        st.setString(3,monthly_salary);
        st.setString(4,yearly_bonus);

        int rs=st.executeUpdate();
        
        if (rs > 0) {
        	System.out.println("successfully inserted");
        	return true;
        }
        con.close();
        return false;
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
}
