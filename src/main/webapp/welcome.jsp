<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome page</title>
</head>
<body>
	<%

   response.setHeader("no-store","must-revalidate");
   response.setHeader("Pragma","no-cache");
   response.setHeader("Expires","0");
   
   if(session.getAttribute("username")==null)
      response.sendRedirect("login.jsp");
   %>


    WELCOME ${username}
    <form action="Logout">
       <input type="submit" value="Logout">
    </form>
</body>
</html>