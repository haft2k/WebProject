<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ page import="net.javaguides.usermanagement.dao.UserDAO"%>
<%@ page import="net.javaguides.usermanagement.model.User"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> 
CTYPE html>
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

 <nav class="navbar navbar-expand-lg navbar-dark"
  style="background-color: tomato;">
  <a class="navbar-brand" href="https://www.javaguides.net">User
   Management App</a>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
   <ul class="navbar-nav mr-auto">
    <li class="nav-item active"><a class="nav-link"
     href="<%=request.getContextPath()%>%>/list">User <span
      class="sr-only">(current)</span></a></li>
   </ul>
  </div>

 </nav>



 <table class="table table-bordered">
  <thead>
   <tr>

    <th>ID</th>
    <th>Name</th>
    <th>Email</th>
    <th>Country</th>
    <th>Actions</th>
   </tr>
  </thead>

  <tbody>
   <c:forEach var="row" items="${rs.rows }">
    <tr>
     <td><c:out value="${row.id }" /></td>
     <td><c:out value="${row.name }" /></td>
     <td><c:out value="${row.email }" /></td>
     <td><c:out value="${row.country }" /></td>
    </tr>
   </c:forEach>
  </tbody>
 </table>

</body>

</html>