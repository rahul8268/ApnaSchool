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
                                        <li><a href="index.jsp" style="color: white">Home</a></li>
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
                                                   
                                                    <li>
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