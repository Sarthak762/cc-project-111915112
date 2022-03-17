package com.signup.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SignupDaoDetail {
	String sql="insert into sarthakdubey_111915112_detail(Employee_ID,password,First_Name,Last_Name,Date_of_Birth,Contact_Number) values(?,?,?,?,?,?)";
    String url="jdbc:mysql://localhost:3306/AuthDatabase";
    public boolean insert(String employee_id,String password,String first_name,String Last_name,String dob,String contact_num) {
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,"root","admin1234");
        PreparedStatement st=con.prepareStatement(sql);
        st.setString(1, employee_id);
        st.setString(2,password);
        st.setString(3,first_name);
        st.setString(4,Last_name);
        st.setString(5,dob);
        st.setString(6,contact_num);

        int rs=st.executeUpdate();
        
        if (rs > 0) {
        	System.out.println("successfully inserted");
        	return true;
        }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
}
