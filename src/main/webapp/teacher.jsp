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
        <h2>Teacher Information Form</h2>
        <h2 style="color: green;">
        <%
            if(request.getAttribute("reply")!=null){
            	out.println(request.getAttribute("reply"));
            }
        
        %>
        </h2>
        <form action="TecherAddServlet" method="get">
        <button type="submit">Click here to add id</button>
        </form>
        <form action="TecherAddServlet" method="POST">
            <div class="form-group">
                <label for="teacher-id">Teacher ID</label>
                <input type="text" id="teacher-id" readonly="readonly" name="id"  value=${id}>
            </div>

            <div class="form-group">
                <label for="first-name">First Name</label>
                <input type="text" id="first-name" name="fName" required="required">
            </div>

            <div class="form-group">
                <label for="last-name">Last Name</label>
                <input type="text" id="last-name" name="lName" >
            </div>

            <div class="form-group">
                <label for="dob">Date of Birth</label>
                <input type="date" id="dob" name="dob" required="required">
            </div>

            <div class="form-group">
                <label for="gender">Gender</label>
                <select id="gender" name="gender" required="required">
                    <option value="">Select</option>
                    <option value="male">Male</option>
                    <option value="female">Female</option>
                    <option value="other">Other</option>
                </select>
            </div>

            <div class="form-group">
                <label for="address">Address</label>
                <textarea id="address" name="address" rows="4" required="required"></textarea>
            </div>

            <div class="form-group">
                <label for="contact-info">Contact Information</label>
                <input type="tel" id="contact-info" name="contactInfo" required="required" >
            </div>

            <div class="form-group">
                <label for="hire-date">Hire Date</label>
                <input type="date" id="hire-date" name="hireDate" required="required" >
            </div>

            <div class="form-group">
                <label for="department">Department</label>
                <input type="text" id="department" name="department" required="required">
            </div>

           

         

            <div class="form-group">
                <button type="submit">Submit</button>
            </div>
        </form>
    </div>
</body>