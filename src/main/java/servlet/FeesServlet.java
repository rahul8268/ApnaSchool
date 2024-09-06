package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import javaClass.DataBaseConn;
import javaClass.FeesDatabase;
import javaClass.StudentDatabase;
import modal.FeesModal;
import modal.StudentModal;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Servlet implementation class FeesServlet
 */
@WebServlet("/FeesServlets")
public class FeesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	StudentDatabase database=new StudentDatabase();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FeesServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idString=request.getParameter("student-id");
		if (!idString.equals("")) {
			
		
		int id=Integer.parseInt(idString);
		
	ArrayList<StudentModal>list=database.fatchStudent();
	
	    for (StudentModal studentModal : list) {
			
	    	if (id==studentModal.getStudent_id()) {
				System.out.println(studentModal.getStudent_fname());
				request.setAttribute("student_id", id);
				request.setAttribute("course",studentModal.getStudent_grade());
	    		request.setAttribute("student_name",studentModal.getStudent_fname());
	    		request.getRequestDispatcher("fees.jsp").forward(request, response);
	    		
			
		}
	    
	    
		}
		}
		}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	    
	    FeesDatabase database=new FeesDatabase();
		FeesModal modal=checkFees(request, response);
		boolean check=database.insertFees(modal);
		
		if (check) {
			request.setAttribute("reply", "Data insertd");
		}else {
			request.setAttribute("reply", "Data not insert");
		}
		
		request.getRequestDispatcher("fees.jsp").forward(request, response);

	}
	
 public FeesModal checkFees(HttpServletRequest request, HttpServletResponse response) {
	String idString=request.getParameter("id");
	int id=0;
	if (!idString.equals("")) {
		
		id=Integer.parseInt(idString);
		
	}
	String studentName=request.getParameter("studentName");
	String course=request.getParameter("course");
	String paymentDate=request.getParameter("paymentDate");
	String paymentAmount=request.getParameter("paymentAmount");
	String paymentMethod=request.getParameter("paymentMethod");
	
	FeesModal modal=new FeesModal(id, studentName, course, paymentAmount, paymentDate, paymentMethod);
	 
	 
	return modal;
	 
 }

}
