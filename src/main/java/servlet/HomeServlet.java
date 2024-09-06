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


public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public HomeServlet() {
        super();
       
    }


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("hello i am home sevlet");
	
		
			
		String nameString=request.getParameter("button");
		System.out.println(nameString);
		
		if ("tedit".equals(nameString)) {
			request.getRequestDispatcher("teacherUpdate.jsp").forward(request, response);
		}else if ("tdelete".equals(nameString)) {
			request.getRequestDispatcher("teacherDelete.jsp").forward(request, response);
		}else  if ("sedit".equals(nameString)) {
			request.getRequestDispatcher("studentUpdate.jsp").forward(request, response);
		}else  if ("sdelete".equals(nameString)) {
			request.getRequestDispatcher("studentDelete.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("feesUpdate.jsp").forward(request, response);
		}
		
	}

}
