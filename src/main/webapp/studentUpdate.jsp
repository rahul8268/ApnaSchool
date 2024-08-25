<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student info</title>
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
<li><a href="studentUpdate.jsp">Update</a></li>
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
<li><a href="classm.html">add</a></li>
<li>update</li>
<li>delete</li>
</ul>
</div>

</li>
</ul>   


     
   <div class="form-container">
        <h2>Update Student Data</h2>
        
        <h2 style="color: green;">
         <%
        if(request.getAttribute("reply")!=null){
        out.println(request.getAttribute("reply"));
        }
        %>
        
        </h2>
        <form action="UpdateServlet" method="get">
         <div class="form-group">
                <label for="student-id">Student ID</label>
                <input type="text" id="student-id" name="student-id" required="required" value=${id}>
                </div>
       <button type="submit">verify</button>
     </form>
        <form action="UpdateServlet" method="POST">
           
            <div class="form-group">
                <label for="student-id">Student ID</label>
                <input type="text" id="student-id" name="student-id" required="required" value=${id}>
              </div>
                
          <div class="form-group">
                <label  for="first-name">First Name</label>
                <input type="text" id="first-name" name="first-name" value=${first_name}>
            </div>

            <div class="form-group">
                <label for="last-name">Last Name</label>
                <input type="text" id="last-name" name="last-name"  value=${last_name} >
            </div>

            <div class="form-group">
                <label for="dob">Date of Birth</label>
                <input type="date" id="dob" name="dob"  value=${dob}>
            </div>

            <div class="form-group">
                <label for="gender">Gender</label>
                <select id="gender" name="gender"   required="required">
                    <option value=${gender}>Select</option>
                    <option value=${gender}>Male</option>
                    <option value=${gender}>Female</option>
                    <option value=${gender}>Other</option>
                </select>
            </div>

            <div class="form-group">
                <label for="address">Address</label>
                <textarea id="address" name="address" rows="4"  required="required"></textarea>
            </div>

            <div class="form-group">
                <label for="contact-info">Parent/Guardian Contact Information</label>
                <input type="tel" id="contact-info" name="contact-info" value=${contect}>
            </div>

            <div class="form-group">
                <label for="enrollment-date">Enrollment Date</label>
                <input type="date" id="enrollment-date" name="enrollment-date"  value=${enrollment}>
            </div>

            <div class="form-group">
                <label for="grade">Grade/Class</label>
                <input type="text" id="grade" name="grade"  value=${grade}>
            </div>

            <div class="form-group">
                <label for="attendance">Attendance Record</label>
                <input id="attendance" name="attendance"  value=${attendance}  ></input>
            </div>

          

            <div class="form-group">
                <button type="submit">Update</button>
            </div>
        </form>
        
        
       
        
    </div>

</body>
</html>