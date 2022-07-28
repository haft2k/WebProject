<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ page import="net.javaguides.usermanagement.dao.UserDAO"%>
<%@ page import="net.javaguides.usermanagement.model.User"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
 href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
 integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
 crossorigin="anonymous">

<sql:setDataSource var="demo" driver="com.mysql.jdbc.Driver"
 url="jdbc:mysql://localhost/demo" user="root" password="root" />

<sql:query dataSource="${demo}" var="rs">  
SELECT * from users;
</sql:query>
</head>

<body>
 <header>
  <nav class="navbar navbar-expand-md navbar-dark"
   style="background-color: tomato">
   <div>
    <a href="https://www.google.com/" class="navbar-brand"> User
     Management App</a>
   </div>
   <ul class="navbar-nav">
    <li><a href="<%=request.getContextPath()%>/list"
     class="nav-link">Users</a></li>
   </ul>
  </nav>
 </header>
 <form name="frm_update">
  <div class="mb-3">
   <label for="exampleInputName" class="form-label">ID</label> <input
    type="text" class="form-control" id="name1" name="tID"> <label
    for="exampleInputName" class="form-label">Name</label> <input
    type="text" class="form-control" id="name1" name="tName"> <label
    for="exampleInputEmail" class="form-label">Email</label> <input
    type="text" class="form-control" id="name1" name="tEmail"> <label
    for="exampleInputCountry" class="form-label">Country</label> <input
    type="text" class="form-control" id="name1" name="tCountry">

  </div>
  <button type="submit" class="btn btn-primary">Update</button>
 </form>
 <sql:setDataSource var="demo" driver="com.mysql.jdbc.Driver"
  url="jdbc:mysql://localhost/demo" user="root" password="root" />
 <c:set var="vID" value="${param.tID}"></c:set>
 <c:set var="vName" value="${param.tName}"></c:set>
 <c:set var="vEmail" value="${param.tEmail}"></c:set>
 <c:set var="vCountry" value="${param.tCountry}"></c:set>

 <sql:update dataSource="${demo}" var="count">
 update users set name=?, email=?,country=?, where id=?;
 </sql:update>

</body>
</html>