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

import javax.swing.text.StyledEditorKit.BoldAction;

/**
 * Servlet implementation class StudentDeleteServlet
 */
@WebServlet("/DeleteServlet")
public class StudentDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id=Integer.parseInt(request.getParameter("student-id"));
		
		StudentDatabase database=new StudentDatabase();
		ArrayList<StudentModal>list= database.fatchStudent();
		
		for (int i = 0; i <list.size(); i++) {
			int st_id=list.get(i).getStudent_id();
			System.out.println(i);
			System.out.println(list.size());
			if (id==st_id) {
				
				 boolean check=database.deleteStudent(id);
				    
				    if(check) {
				    	
				    	request.setAttribute("reply", "Student data deleted success");
				    	request.getRequestDispatcher("studentDelete.jsp").forward(request, response);
				    }else {
				    	
				    	request.setAttribute("reply", "Student data not delete");
				    	request.getRequestDispatcher("studentDelete.jsp").forward(request, response);
				    }


				
			}else {
				
				request.setAttribute("reply", "Student not found");
		    	request.getRequestDispatcher("studentDelete.jsp").forward(request, response);
			}
		}
   
		
	}
	

}
