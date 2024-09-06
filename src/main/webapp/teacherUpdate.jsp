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



                                <div>
                                    <ul>
                                        <li><a href="index.html" style="color: white">Home</a></li>
                                        <li>Student
                                            <div class="drop-down">
                                                <ul>
                                               
                                                    <li><a href="student.jsp">add</a></li>
                                                    
                                               </ul>
                                            </div>
                                        </li>


                                        <li>Teacher
                                            <div class="drop-down">
                                                <ul>
                                                    <li><a href="teacher.jsp">add</a></li>
                                                   
                                                    
                                                </ul>
                                            </div>

                                        </li>

                                      
                                        <li>fees
                                            <div class="drop-down">
                                                <ul>
                                                    <li><a href="fees.jsp">add</a></li>
                                                   
                                                </ul>
                                            </div>

                                        </li>

                                                                           </ul>
                                </div>


  <div class="form-container">
        <h2>Teacher Update information</h2>
        <h2 style="color: green;">
        <%
            if(request.getAttribute("reply")!=null){
            	out.println(request.getAttribute("reply"));
            }
        
        %>
        </h2>
        <form action="TeacherUpdateServlet" method="get">
         <div class="form-group">
                <label for="teacher-id">Teacher ID</label>
                <input type="text" id="teacher-id"  name="id" required="required" value=${id}>
            </div>
        
        <button type="submit">verify your User</button>
        </form>
        <form action="TeacherUpdateServlet" method="POST">
            <div class="form-group">
                <label for="teacher-id">Teacher ID</label>
                <input type="text" id="teacher-id" readonly="readonly" name="id"  value=${id}>
            </div>

            <div class="form-group">
                <label for="first-name">First Name</label>
                <input type="text" id="first-name" name="fName" value=${fName} required="required">
            </div>

            <div class="form-group">
                <label for="last-name">Last Name</label>
                <input type="text" id="last-name" name="lName" value=${lName} >
            </div>

            <div class="form-group">
                <label for="dob">Date of Birth</label>
                <input type="date" id="dob" name="dob" value=${dob} required="required">
            </div>

            <div class="form-group">
                <label for="gender">Gender</label>
                <input id="gender" name="gender" required="required" value=${gender} >
                   
            </div>

            <div class="form-group">
                <label for="address">Address</label>
                <input id="address" name="address" required="required"  value=${address} >
                
               
            </div>

            <div class="form-group">
                <label for="contact-info">Contact Information</label>
                <input type="tel" id="contact-info" name="contactInfo" required="required" value=${contectInfo} >
            </div>

            <div class="form-group">
                <label for="hire-date">Hire Date</label>
                <input type="date" id="hire-date" name="hireDate" required="required" value=${hireDate} >
            </div>

            <div class="form-group">
                <label for="department">Department</label>
                <input type="text" id="department" name="department" required="required" value=${department} >
            </div>

           
         

            <div class="form-group">
                <button type="submit">Submit</button>
            </div>
        </form>
    </div>
</html>