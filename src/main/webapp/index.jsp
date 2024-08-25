   
<%@page import="javaClass.StudentDatabase"%>
<%@page import="modal.StudentModal"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

  
  
  
 
    
   <!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>School Managment </title>
   <link rel="stylesheet" href="nav.css">
<link rel="stylesheet" href="styles.css">
    <link rel="shortcut icon" href="fav.io/logo.jpg" type="image/x-icon">
</head>

<body>


<div>
  <ul>
<li ><a  href="index.html" style="color: white">Home</a></li>
<li>Student
<div class="drop-down">
<ul>
<li ><a href="student.jsp">add</a></li>
<li><a href="studentUpdate.jsp">Update</a></li>
<li><a href="studentDelete.jsp">Delete</a></li>
</ul>
</div>
</li>


<li>Teacher
<div class="drop-down">
<ul>
<li ><a href="teacher.jsp">add</a></li>
<li><a href="teacherUpdate.jsp">Update</a></li>
<li><a href="teacherDelete.jsp">Delete</a><li>
</ul>
</div>

</li>

<li>Class
<div class="drop-down">
<ul>
<li><a href="classm.html">add</a></li>
<li>update</li>
<li>delete</li>
</ul>
</div>

</li>

<li>Course
<div class="drop-down">
<ul>
<li><a href="classm.html">add</a></li>
<li>update</li>
<li>delete</li>
</ul>
</div>

</li>

<li>Attendance
<div class="drop-down">
<ul>
<li><a href="classm.html">add</a></li>
<li>update</li>
<li>delete</li>
</ul>
</div>

</li>

<li>Examination
<div class="drop-down">
<ul>
<li><a href="classm.html">add</a></li>
<li>update</li>
<li>delete</li>
</ul>
</div>

</li>

<li>fees
<div class="drop-down">
<ul>
<li><a href="classm.html">add</a></li>
<li>update</li>
<li>delete</li>
</ul>
</div>

</li>

<li>TimeTable
<div class="drop-down">
<ul>
<li><a href="classm.html">add</a></li>
<li>update</li>
<li>delete</li>
</ul>
</div>

</li>


<li >class
<div class="drop-down">
<ul>
<li><a href="classm.html">add</a></li>
<li>update</li>
<li>delete</li>
</ul>
</div>

</li>
</ul>   
</div>

  <div class="search-container">
  <form action="HomeServlet" method="post">
  
   <input type="text" placeholder="Search..." />
     <button type="submit" >Search</button>
  
  </form>
       
  </div>
  
  
   <h2>Items in the List:</h2>
    <ul>
   
  
        <c:forEach var="item" items="${list}">
            <li>${item}</li>
        </c:forEach>
    </ul>
 
    
    </body>
    </html>