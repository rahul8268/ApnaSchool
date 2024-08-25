<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="nav.css">
<link rel="stylesheet" href="styles.css">
</head>
<body>
<div>
<ul>
<li>Home</li>
<li>Student
<div class="drop-down">
<ul>
<li ><a href="student.jsp">add</a></li>
<li>update</li>
<li>delete</li>
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
<li><a href="classm.html">add</a></li>
<li>update</li>
<li>delete</li>
</ul>
</div>

</li>
</ul>   
</div>

   <div class="form-container">
        <h2>Student Enrollment Form</h2>
        
         <h2 style="color: green;">
         <%
        if(request.getAttribute("reply")!=null){
        out.println(request.getAttribute("reply"));
        
      
        }
        %>
        
        </h2>
        <form  action="StudentServlet" method=get>
        <button type="submit">add auto Student id</button>
        </form>
        
        <form action="StudentServlet" method="POST">
            <div class="form-group">
                <label for="student-id">Student ID</label>
                <input type="text" id="student-id" name="student-id" readonly="readonly"  value=${id}>
            </div>
            <div class="form-group">
                <label for="first-name">First Name</label>
                <input type="text" id="first-name" name="first-name">
            </div>

            <div class="form-group">
                <label for="last-name">Last Name</label>
                <input type="text" id="last-name" name="last-name" >
            </div>

            <div class="form-group">
                <label for="dob">Date of Birth</label>
                <input type="date" id="dob" name="dob" >
            </div>

            <div class="form-group">
                <label for="gender">Gender</label>
                <select id="gender" name="gender" >
                    <option value="">Select</option>
                    <option value="male">Male</option>
                    <option value="female">Female</option>
                    <option value="other">Other</option>
                </select>
            </div>

            <div class="form-group">
                <label for="address">Address</label>
                <textarea id="address" name="address" rows="4" ></textarea>
            </div>

            <div class="form-group">
                <label for="contact-info">Parent/Guardian Contact Information</label>
                <input type="tel" id="contact-info" name="contact-info" >
            </div>

            <div class="form-group">
                <label for="enrollment-date">Enrollment Date</label>
                <input type="date" id="enrollment-date" name="enrollment-date">
            </div>

            <div class="form-group">
                <label for="grade">Grade/Class</label>
                <input type="text" id="grade" name="grade" >
            </div>

            <div class="form-group">
                <label for="attendance">Attendance Record</label>
                <textarea id="attendance" name="attendance" rows="2"></textarea>
            </div>

            <div class="form-group">
                <label for="academic-performance">Academic Performance (Grades/Marks)</label>
                <textarea id="academic-performance" name="academic-performance" rows="2"></textarea>
            </div>

            <div class="form-group">
                <label for="health-info">Health Information</label>
                <textarea id="health-info" name="health-info" rows="2"></textarea>
            </div>

            <div class="form-group">
                <label for="extracurricular-activities">Extracurricular Activities</label>
                <textarea id="extracurricular-activities" name="extracurricular-activities" rows="2"></textarea>
            </div>

            <div class="form-group">
                <button type="submit">Submit</button>
            </div>
        </form>
 </div>

</body>
</html>