<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
</head>
<body>
	<div class="signupFrm">
    <form action="Signup" method="post" class="form">
      <h1 class="title">Sign up</h1>

      <div class="inputContainer">
      	 <label for="" class="label">Employee Id</label>
        <input type="text" class="input" name="employee_id">
      </div>

      <div class="inputContainer">
              <label for="" class="label">First Name</label>
        <input type="text" class="input" name="firstname">

      </div>
      
      <div class="inputContainer">
              <label for="" class="label">Last Name</label>
        <input type="text" class="input" name="lastname" >

      </div>
      
       <div class="inputContainer">
               <label for="" class="label">Contact Number</label>
        <input type="text" class="input" name="contact_num">

      </div>
      
      <div class="inputContainer">
              <label for="" class="label">Date of birth</label>
        <input type="text" class="input" name="dob">

      </div>
      
      <div class="inputContainer">
              <label for="" class="label">Password</label>
        <input type="text" class="input" name="password">

      </div>
      
      <div class="inputContainer">
              <label for="" class="label">Job Role</label>
        <input type="text" class="input" name="job_role">

      </div>
      <div class="inputContainer">
              <label for="" class="label">Montly Salary</label>
        <input type="text" class="input" name="monthly_salary">

      </div>
      <div class="inputContainer">
              <label for="" class="label">Yearly Bonus</label>
        <input type="text" class="input" name="yearly_bonus">

      </div>

      <input type="submit" class="submitBtn" value="Sign up">
    </form>
  </div>
</body>
</html>