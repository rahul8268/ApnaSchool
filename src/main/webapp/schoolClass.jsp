<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>class info</title>
 <link rel="stylesheet" href="nav.css">
<link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container">
        <h1>Class Management Form</h1>
        <form action="classServlet" method="post">
            <div class="form-group">
                <label for="className">Class Name</label>
                <input type="text" id="className" name="className" required>
            </div>
            <div class="form-group">
                <label for="classCode">Class Code</label>
                <input type="text" id="classCode" name="classCode" required>
            </div>
            <div class="form-group">
                <label for="teacher">Assign Teacher</label>
                <select id="teacher" name="teacher" >
                    <option value="">Select Teacher</option>
                    <option value=${teacher1}>Teacher 1</option>
                    <option value=${teacher2}></option>
                    <option value=${teacher3}>Teacher 3</option>
                </select>
            </div>
            <div class="form-group">
                <label for="students">Enrolled Students</label>
                <textarea id="students" name="students" placeholder="Enter student names separated by commas" required></textarea>
            </div>
            <div class="form-group">
                <button type="submit">Submit</button>
            </div>
        </form>
    </div>
</body>
</html>