   
<%@page import="modal.FeesModal"%>
<%@page import="javaClass.FeesDatabase"%>
<%@page import="modal.TeacherModal"%>
<%@page import="javaClass.TeacherDatabase"%>
<%@page import="javaClass.StudentDatabase"%>
<%@page import="modal.StudentModal"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


  
  
  
 
    
   <!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>School Managment </title>
   <link rel="stylesheet" href="nav.css">
<link rel="stylesheet" href="styles.css">
<link rel="stylesheet" href="class.css">
    <link rel="shortcut icon" href="fav.io/logo.jpg" type="image/x-icon">
    
    
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


                                <select id="formselector">

                                    <option value=""disabled selected>choose an form</option>
                                    <option value="student">Student</option>
                                    <option value="teacher">teacher</option>
                                    <option  value="fees">fees</option> 
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
                        out.print("<form action="+"HomeServlet"+" "+ "method="+"post"+">");
                        out.println("<td>");
                        out.println("<button name="+"button"+" value="+"sedit"+" type="+"submit"+">"+"edit");
                        out.println("</button>");
                        out.println("</td>");
                        out.print("</form>");
                       
                        out.print("<form action="+"HomeServlet"+" "+ "method="+"post"+">");
                        out.println("<td>");
                        out.println("<button name="+"button"+" value="+"sdelete"+" type="+"submit"+">"+"delete");
                        out.println("</button>");
                        out.println("</td>");
                        out.print("</form>");
                        
                        
                    
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
                  
                        out.print("<form action="+"HomeServlet"+" "+ "method="+"post"+">");
                        out.println("<td>");
                        out.println("<button name="+"button"+" value="+"tedit"+" type="+"submit"+">"+"edit");
                        out.println("</button>");
                        out.println("</td>");
                        out.print("</form>");
                       
                        out.print("<form action="+"HomeServlet"+" "+ "method="+"post"+">");
                        out.println("<td>");
                        out.println("<button name="+"button"+" value="+"tdelete"+" type="+"submit"+">"+"delete");
                        out.println("</button>");
                        out.println("</td>");
                        out.print("</form>");
                        
                    
                    out.println("</tr>");
                    out.println("<button name="+"button"+" value="+"fpay"+" type="+"submit"+">"+"pay");
                }
            }
        %>

</table>

                                  

                                </div>
                                
                                
                                
                                
                                
                                <div class="fees-div form" id="fees" style="display: none; margin: 2vw;">
                                    
                                    <h1>Fees info</h1>
<table >
<tr >
<th >Student id  </th>
<th>Student Name </th>
<th>class</th>
<th >amount  </th>
<th>payment Date </th>
<th>Payment Methode</th>


<th>Pay</th>




 <% 
            FeesDatabase fdatabase=new FeesDatabase();
            ArrayList<FeesModal>fdataList=fdatabase.fatchFees();
            if (fdataList != null) {
                for (int i=0;i<fdataList.size();i++) {
                	
                    out.println("<tr>");
                        
                        out.println("<td>" + fdataList.get(i).getId()+ "</td>");
                        out.println("<td>" + fdataList.get(i).getName() + "</td>");
                        out.println("<td>" + fdataList.get(i).getCourse() + "</td>");
                        out.println("<td>" + fdataList.get(i).getAmount() + "</td>");
                        out.println("<td>" + fdataList.get(i).getPaymentDate() + "</td>");
                        out.println("<td>" + fdataList.get(i).getPaymentMethod() + "</td>");
                        
                        
                  
                        out.print("<form action="+"FeesUpdateServlet"+" "+ "method="+"post"+">");
                        out.println("<td>");
                        out.println("<button name="+"button"+" value="+"fpay"+" type="+"submit"+">"+"pay");
                        out.println("</button>");
                        out.println("</td>");
                        out.print("</form>");
                    
                    out.println("</tr>");
                }
            }
        %>

</table>

                                  

                                </div>
                                

                                <script src="formhide.js"></script>
                            </body>
 
  
     
  
 
    
    </body>
    </html>