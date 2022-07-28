<%@ page import="net.javaguides.usermanagement.dao.UserDAO"%>
<%@ page import="net.javaguides.usermanagement.model.User"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
 href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
 integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
 crossorigin="anonymous">
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

  <div></div>

 </nav>

 <form action="user-delete-save.jsp">
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
    <%
    UserDAO userDao = new UserDAO();
    for (User user : userDao.selectAllUsers()) {
    %>
    <tr>
     <td><%=user.getId()%></td>
     <td><%=user.getName()%></td>
     <td><%=user.getEmail()%></td>
     <td><%=user.getCountry()%></td>
     <td><input type="checkbox" name="lstid"
       value="<%=user.getId()%>"></td>
    </tr>
    <%
    }
    %>
   </tbody>
  </table>
  <input type="submit" name="submit" value="submit" />
 </form>

</body>

</html>