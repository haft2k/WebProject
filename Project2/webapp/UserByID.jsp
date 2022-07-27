<%@ page import="net.javaguides.usermanagement.dao.UserDAO"%>
<%@ page import="net.javaguides.usermanagement.model.User"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
            integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
    </head>

    <body>
        <nav class="navbar navbar-expand-lg navbar-dark" style="background-color: tomato;">
            <a class="navbar-brand" href="https://www.javaguides.net">User Management App</a>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="<%=request.getContextPath()%>%>/list">User <span
                                class="sr-only">(current)</span></a>
                    </li>
                </ul>
            </div>
            
            <div>
            <form class="d-flex" role="search" action="ResultUserListByID.jsp">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" name="id">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
            </div>

        </nav>


    </body>

    </html>