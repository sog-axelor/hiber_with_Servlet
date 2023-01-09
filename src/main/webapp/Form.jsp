

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 class="text-center my-3">Register Form</h1>
<div class="container">
<form method="post" action="Test1">
<div class="form-group">
    <label >Name</label>
    <input type="text" class="form-control"  placeholder="Enter name" name="name">
  </div>
 
  <div class="form-group">
    <label >BooK Name</label>
    <input type="text" class="form-control" name="book" placeholder="Enter Street">
  </div>
  <div class="form-group">
    <label >City</label>
    <input type="text" class="form-control"  name="city" placeholder="Enter City">
  </div>
 
  <Input type="submit"   name="submit" class="btn btn-primary">
</form></div>



</body>
</html>