<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/admin/category/insert" method="post" enctype="multipart/form-data">
  <label for="categoryName">Category Name:</label><br>
  <input type="text" id="categoryName" name="categoryName"><br>
  
  <label for="images">Images:</label><br>
  <img id="imagess" height="150" width="200" src="" />
  <input type="file" onchange="chooseFile(this)" id="images" name="images"><br>
  
  <label for="status">Status:</label><br>
  <input type="text" id="status" name="status">
  <br>
  <br>
  <input type="submit" value="Submit">
</form> 
</body>
</html>