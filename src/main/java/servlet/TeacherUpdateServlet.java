package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import javaClass.TeacherDatabase;
import modal.TeacherModal;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Servlet implementation class TeacherUpdateServlet
 */
public class TeacherUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	TecherAddServlet servlet=new TecherAddServlet();
	TeacherDatabase database=new TeacherDatabase();
       
   
    public TeacherUpdateServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int id=servlet.fatchdetails(request, response,"").getId();
		ArrayList<TeacherModal>list=database.fatchTeacher();
		
		for (int i = 0; i < list.size(); i++) {
			
			int  setid=list.get(i).getId();
			String fNameString=list.get(i).getFirstName();
			String lNameString=list.get(i).getLastName();
			String dob=list.get(i).getDob();
			String gender=list.get(i).getGender();
			String address=list.get(i).getAddress();
			String contect=list.get(i).getContectNumber();
			String hireDate=list.get(i).getHireDate();
			String department=list.get(i).getDepartment();
			String subject=list.get(i).getSubjectTaught();
			String classSedule=list.get(i).getClassSedule();
			String attandece=list.get(i).getAttendecRecode();
			
			
			
			 
			 if (id==setid) {
				 
					try {
						request.setAttribute("id", setid);
						request.setAttribute("fName", fNameString);
						request.setAttribute("lName",lNameString );
						request.setAttribute("dob", dob);
						request.setAttribute("contect", contect);
						request.setAttribute("hireDate",hireDate );
						request.setAttribute("department",department );
						request.setAttribute("gender", gender);
						
						request.getRequestDispatcher("teacherUpdate.jsp").forward(request, response);
					} catch (ServletException | IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				      
				
			}
			
		}
		
		request.setAttribute("reply", "data not exist");
		request.getRequestDispatcher("teacherUpdate.jsp").forward(request, response);
	
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	TeacherModal modal=	servlet.fatchdetails(request, response,"teacherUpdate.jsp");
	
	try {
		boolean check=database.updateTeacher(modal,modal.getId());
		
		if (check) {
			request.setAttribute("reply", "Data updated success");
		}else {
			request.setAttribute("reply", "Data not Update");
		}
		
		request.getRequestDispatcher("teacherUpdate.jsp").forward(request, response);
	} catch (SQLException e) {
		
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
		
		
	}

}
