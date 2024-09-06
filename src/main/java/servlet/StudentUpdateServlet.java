package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import javaClass.StudentDatabase;
import modal.StudentModal;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Servlet implementation class StudentUpdateServlet
 */
@WebServlet("/UpdateServlet")
public class StudentUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		StudentDatabase database=new StudentDatabase();
		StudentServlet studentServlet=new StudentServlet();
		ArrayList<StudentModal>studentList=studentServlet.fatchStudent(database);
		int id=Integer.parseInt(request.getParameter("student-id"));
		
		System.out.println(id);
		for (int i=0;i<studentList.size();i++) {
			
			System.out.println(studentList.size());
			if (id==studentList.get(i).getStudent_id()) {
			  System.out.println(studentList.get(i).getStudent_id());
				request.setAttribute("id", studentList.get(i).getStudent_id());
				request.setAttribute("last_name", studentList.get(i).getStudent_lname());
				request.setAttribute("gender", studentList.get(i).getStudent_gender());
				request.setAttribute("grade",studentList.get(i).getStudent_grade());
				request.setAttribute("dob", studentList.get(i).getStudent_dob());
				request.setAttribute("enrollment",studentList.get(i).getStudent_enrollmentdob());
				request.setAttribute("first_name",studentList.get(i).getStudent_fname());
				request.setAttribute("contect", studentList.get(i).getStudent_parentcontect());
				request.setAttribute("address", studentList.get(i).getStudent_address());
				request.getRequestDispatcher("studentUpdate.jsp").forward(request, response);
				
				
			}else {
				
				request.setAttribute("reply", "No data found");
				request.getRequestDispatcher("studentUpdate.jsp").forward(request, response);
				
				
			}
		}
		

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		StudentDatabase database=new StudentDatabase();
		
		updateStudent(request, response, database);
		
	}
	
public void updateStudent(HttpServletRequest request,HttpServletResponse response ,StudentDatabase database) throws ServletException, IOException {
		
		StudentServlet studentServlet=new StudentServlet();
		
		StudentModal modal=studentServlet.fatchDetails(request,response);
		System.out.println("id is "+modal.getStudent_id());
		
		try {
			database.updateStudent(modal,modal.getStudent_id());
			request.setAttribute("reply","data updated success");
			request.getRequestDispatcher("studentUpdate.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			request.setAttribute("reply","No data");
			request.getRequestDispatcher("studentUpdate.jsp").forward(request, response);
		}
	}



}
