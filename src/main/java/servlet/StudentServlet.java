package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import javaClass.DataBaseConn;
import javaClass.StudentDatabase;
import modal.StudentModal;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;







/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DataBaseConn conn=null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentDatabase database=new StudentDatabase();
		
		
		ArrayList<StudentModal>list=fatchStudent(database);
		 int i=0;
		 int checkid=1;
		 if (list.size()>0) {
			
		for (i = 0;  i<list.size()-1; i++);
		int id=list.get(i).getStudent_id();
		 checkid=id+1;
		
		request.setAttribute("id", checkid);
		request.getRequestDispatcher("student.jsp").forward(request, response);
		
		
	}
		 
	
	 checkid=1;
	
	request.setAttribute("id", checkid);
	request.getRequestDispatcher("student.jsp").forward(request, response);

	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		StudentDatabase database=new StudentDatabase();
		
		
		//fatch data for boxes
		fatchDetails(request,response);
		//insert student
		insertStudent(request,response,database);
		//update student data
		
		
	
		
		
	}
	
	public StudentModal fatchDetails(HttpServletRequest request,HttpServletResponse response) {
		
		StudentModal modal=new StudentModal();
		int id=0;
		String  idstring=request.getParameter("student-id");
		if (!idstring.equals("")) {
			id=Integer.parseInt(idstring);
		}else {
			
			request.setAttribute("reply", "please fill the Student id");
			try {
				request.getRequestDispatcher("student.jsp").forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println("id is "+id);
		String fname=request.getParameter("first-name");
		String lname=request.getParameter("last-name");
		String dobString=request.getParameter("dob");
	    String genderString=request.getParameter("gender");
	    String addreshString=request.getParameter("address");
	    String contectinfoString=request.getParameter("contact-info");
	    String enrollmentDate=request.getParameter("enrollment-date");
	    String grade=request.getParameter("grade");
	    String attendance=request.getParameter("attendance");
	    
	    modal.setStudent_address(addreshString);
	    modal.setStudent_id(id);
	    modal.setStudent_fname(fname);
	    modal.setStudent_lname(lname);
	    modal.setStudent_dob(dobString);
	    modal.setStudent_gender(genderString);
	    modal.setStudent_parentcontect(contectinfoString);
	    modal.setStudent_enrollmentdob(enrollmentDate);
	    modal.setStudent_grade(grade);
	  
	    
	    return modal;
		
	}
	
	public void insertStudent(HttpServletRequest request,HttpServletResponse response,StudentDatabase database) throws ServletException, IOException {
		
	
		
		
		
	    
	   
	    StudentModal modal=fatchDetails(request,response);
		
		boolean check=database.insertStudentInfo(modal);
		
		if (check) {
			request.setAttribute("reply", "data added success");
		}else {
			request.setAttribute("reply", "data not added");
		}
		
		request.getRequestDispatcher("student.jsp").forward(request, response);
		
		
	}
	
	public ArrayList<StudentModal>fatchStudent(StudentDatabase database){
		ArrayList<StudentModal>studentList=new ArrayList<StudentModal>();
		studentList=database.fatchStudent();
		
		return studentList;
	}
	
	

}
