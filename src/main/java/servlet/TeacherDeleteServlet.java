package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import javaClass.TeacherDatabase;
import modal.TeacherModal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

@WebServlet("/TeacherDelete")
public class TeacherDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public TeacherDeleteServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		TeacherDatabase database=new TeacherDatabase();
		ArrayList<TeacherModal>list=database.fatchTeacher();
		
		String  idString=request.getParameter("id");
		
		for (int i = 0; i <list.size(); i++) {
			int checkid=list.get(i).getId();
			
			if (!idString.equals("")) {
				int id=Integer.parseInt(idString);
				
				if (id==checkid) {
					
					boolean check=database.deleteTeacher(id);
					
					if (check) {
						
						request.setAttribute("reply", "data deleted success");
						
					}else {
						request.setAttribute("reply", "data not delete ");
					}
					
					request.getRequestDispatcher("teacherDelete.jsp").forward(request, response);
					
				}
				
				}
			
			}
		
		request.setAttribute("reply", "data not exists ");
		request.getRequestDispatcher("teacherDelete.jsp").forward(request, response);
		
		
		
		
	
	}

}
