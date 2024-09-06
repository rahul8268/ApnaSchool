<%@page import="modal.TeacherModal" %>
    <%@page import="javaClass.TeacherDatabase" %>
        <%@page import="javaClass.StudentDatabase" %>
            <%@page import="modal.StudentModal" %>
                <%@page import="java.util.ArrayList" %>
                    <%@page import="java.util.List" %>
                        <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"
                            %>
                            <!DOCTYPE html>
                            <html>

                            <head>

                                <link rel="stylesheet" href="nav.css">
                                <link rel="stylesheet" href="styles.css">
                                <link rel="stylesheet" href="class.css">
                                <meta charset="ISO-8859-1">
                                <title>Insert title here</title>

                                <style>
                                    table {
                                        width: 100%;
                                        border-collapse: collapse;
                                    }

                                    th,
                                    td {
                                        border: 1px solid black;
                                        padding: 8px;
                                        text-align: left;
                                    }

                                 
                                </style>
                            </head>

                            <body>


                                <div>
                                    <ul>
                                        <li><a href="index.jsp" style="color: white">Home</a></li>
                                        <li>Student
                                           
                                                    <li><a href="student.jsp">add</a></li>
                                                    
                                             
                                     


                                        <li>Teacher
                                            
                                                    <li><a href="teacher.jsp">add</a></li>
                                                  

                                       

                                      
                                        <li>fees
                                            
                                                    <li><a href="fees.jsp">add</a></li>
                                                   
                                              

                                                                           </ul>
                                </div>

                                <select id="formselector">

                                    <option value=""disabled selected>choose an form</option>
                                    <option value="student">Student</option>
                                    <option value="teacher">teacher</option>
                                </select>





                                <div class="student form" style="margin: 10px; padding: 0px;" id="student">

                                    <h1>student info</h1>

                                  <table >
<tr >
<th >student id  </th>
<th>First Name </th>
<th>Last Name</th>
<th >Dob  </th>
<th>Gender </th>
<th>Contect Number</th>
<th>Enrollment DOB </th>
<th>Address</th>
<th>student grade</th>
<th>Edit</th>
<th>Delete</th>



 <% 
            StudentDatabase database=new StudentDatabase();
            ArrayList<StudentModal>dataList=database.fatchStudent();
            if (dataList != null) {
                for (int i=0;i<dataList.size();i++) {
                    out.println("<tr>");
                    
                        out.println("<td>" + dataList.get(i).getStudent_id()+ "</td>");
                        out.println("<td>" + dataList.get(i).getStudent_fname() + "</td>");
                        out.println("<td>" + dataList.get(i).getStudent_lname() + "</td>");
                        out.println("<td>" + dataList.get(i).getStudent_dob() + "</td>");
                        out.println("<td>" + dataList.get(i).getStudent_gender() + "</td>");
                        out.println("<td>" + dataList.get(i).getStudent_parentcontect() + "</td>");
                        out.println("<td>" + dataList.get(i).getStudent_enrollmentdob() + "</td>");
                        out.println("<td>" + dataList.get(i).getStudent_address() + "</td>");
                        out.println("<td>" + dataList.get(i).getStudent_grade() + "</td>");
                        out.println("<td>"+"<button>Edit</Button>"+ "</td>");
                        out.println("<td>" +"<button>delete</Button>" + "</td>");
                        
                    
                    out.println("</tr>");
                }
            }
        %>

</table>

                                </div>




                                <div class="student-div form" id="teacher" style="display: none; margin: 2vw;">
                                    
                                    <h1>Teacher info</h1>
<table >
<tr >
<th >Teacher id  </th>
<th>First Name </th>
<th>Last Name</th>
<th >Dob  </th>
<th>Gender </th>
<th>Contect Number</th>
<th>Hire Date </th>
<th>department</th>

<th>Edit</th>
<th>Delete</th>




 <% 
            TeacherDatabase tdatabase=new TeacherDatabase();
            ArrayList<TeacherModal>tdataList=tdatabase.fatchTeacher();
            if (tdataList != null) {
                for (int i=0;i<tdataList.size();i++) {
                    out.println("<tr>");
                    
                        out.println("<td>" + tdataList.get(i).getId()+ "</td>");
                        out.println("<td>" + tdataList.get(i).getFirstName() + "</td>");
                        out.println("<td>" + tdataList.get(i).getLastName() + "</td>");
                        out.println("<td>" + tdataList.get(i).getDob() + "</td>");
                        out.println("<td>" + tdataList.get(i).getGender() + "</td>");
                        out.println("<td>" + tdataList.get(i).getContectNumber() + "</td>");
                        out.println("<td>" + tdataList.get(i).getHireDate() + "</td>");
                        out.println("<td>" + tdataList.get(i).getDepartment() + "</td>");
                  
                        out.println("<td>"+"<button>Edit</Button>"+ "</td>");
                        out.println("<td>" +"<button>delete</Button>" + "</td>");
                        
                    
                    out.println("</tr>");
                }
            }
        %>

</table>

                                  

                                </div>

                                <script src="formhide.js"></script>
                            </body>

                            </html>