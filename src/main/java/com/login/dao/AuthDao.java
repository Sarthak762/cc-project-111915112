package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class AuthDao {

	String sql="select * from sarthakdubey_111915112_detail where Employee_ID=? and password=?;";
    String url="jdbc:mysql://localhost:3306/AuthDatabase";

    public boolean check(String employee_id,String pass) {
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,"root","admin1234");
        PreparedStatement st=con.prepareStatement(sql);
        st.setString(1, employee_id);
        st.setString(2,pass);
        System.out.println("login"+employee_id);
        ResultSet rs=st.executeQuery();

        if(rs.next())
        {
            return true;
        }
        }catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    }


}