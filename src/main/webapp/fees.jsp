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

<form action="FeesServlets" method="get">
 <div class="form-group">
                <label for="student-id">Student ID</label>
                <input type="number" id="student-id" name="student-id"  required="required">
            </div>
            
            
             <div class="form-group">
                <button type="submit">Submit</button>
            </div>
</form>
 

 <div class="container">
        <h2>Student Fees Management Form</h2>
        
        
          <h2 style="color: green;">
         <%
        if(request.getAttribute("reply")!=null){
        out.println(request.getAttribute("reply"));
        
      
        }
        %>
        </h2>
        <form action="FeesServlets" method="post">
        
         <div class="form-group">
                <label for="studentId">Student ID</label>
                <input type="text" id="id" name="id" readonly="readonly" value=${student_id} >
            </div>
            
            <div class="form-group">
                <label for="studentName">Student Name</label>
                <input type="text" id="studentName" name="studentName" readonly="readonly" value=${student_name} >
            </div>
           
            <div class="form-group">
                <label for="class">class</label>
                <input type="text" id="class" name="course" value=${course} >
            </div>
            <div class="form-group">
                <label for="paymentAmount">Payment Amount</label>
                <input type="number" id="paymentAmount" name="paymentAmount" required>
            </div>
            
             <div class="form-group">
                <label for="paymentDate">Payment Date</label>
                <input type="date" id="paymentDate" name="paymentDate" >
            </div>
            <div class="form-group">
                <label for="paymentMethod">Payment Method</label>
                <select id="paymentMethod" name="paymentMethod" required>
                    <option value="">Select Payment Method</option>
                    <option value="Cash">Cash</option>
                    <option value="CreditCard">Credit Card</option>
                    <option value="DebitCard">Debit Card</option>
                    <option value="BankTransfer">Bank Transfer</option>
                    <option value="UPI">UPI</option>
                </select>
            </div>
            <div class="form-group">
                <button type="submit">Submit Payment</button>
            </div>
        </form>
    </div>
 
</body>
</html>