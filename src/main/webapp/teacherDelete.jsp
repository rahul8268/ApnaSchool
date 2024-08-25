<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>teacher info</title>
<link rel="stylesheet" href="nav.css">
<link rel="stylesheet" href="styles.css">
</head>
<body>


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


<li>class
<div class="drop-down">
<ul>
<li><a href="classm.jsp">add</a></li>
<li>update</li>
<li>delete</li>
</ul>
</div>

</li>
</ul>   


 <div class="form-container">
        <h2>Delete Teacher Data</h2>
        
        <h2 style="color: green;">
         <%
        if(request.getAttribute("reply")!=null){
        out.println(request.getAttribute("reply"));
        }
        %>
        
        </h2>
        <form action="TeacherDelete" method="post">
         <div class="form-group">
                <label for="student-id">Student ID</label>
                <input type="text" id="student-id" name="id" required="required" >
                </div>
       <button type="submit">delete</button>
     </form>
     
     </div>

</body>
</html>