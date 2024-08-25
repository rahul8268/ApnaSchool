package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import javaClass.TeacherDatabase;
import modal.StudentModal;
import modal.TeacherModal;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.catalina.tribes.group.AbsoluteOrder.AbsoluteComparator;

/**
 * Servlet implementation class TecherAddServlet
 */
@WebServlet("/TeacherAddServlet")
public class TecherAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public TecherAddServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		TeacherDatabase database=new TeacherDatabase();
		ArrayList<TeacherModal>list=database.fatchTeacher();
		
		int setid=autoSetId(list, request, response);
		try {
			request.setAttribute("id", setid);
			request.getRequestDispatcher("teacher.jsp").forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		TeacherDatabase database=new TeacherDatabase();
		
		insertTecher(request, response, database);
		
		
	}
	
	
	public TeacherModal fatchdetails(HttpServletRequest request, HttpServletResponse response,String formValue) {
		
		int id=0;
		String idsString=request.getParameter("id");
		if (!idsString.equals("")) {
			System.out.println("idstring is="+idsString);
			 id=Integer.parseInt(idsString); 
		}else {
			
			try {
			
				request.setAttribute("reply","Please fill the Teacher id");
				request.getRequestDispatcher(formValue).forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		String fNameString=request.getParameter("fName");
		String lNameString=request.getParameter("lName");
		String dob=request.getParameter("dob");
		String gender=request.getParameter("gender");
		String contectinfo=request.getParameter("contectInfo");
		String address=request.getParameter("address");
		String hireDate=request.getParameter("hireDate");
		String department=request.getParameter("department");
		String subjectTaught=request.getParameter("subjectTaught");
		String classSedule=request.getParameter("classSedule");
		String attendanceRecord=request.getParameter("attendanceRecord");
		
		TeacherModal modal=new TeacherModal(id,fNameString,lNameString,dob,gender,contectinfo,address,hireDate,department,subjectTaught,classSedule,attendanceRecord);
		
		
		return modal;
		
	}
	
	
	public void insertTecher(HttpServletRequest request, HttpServletResponse response,TeacherDatabase database) {
		ArrayList<TeacherModal>list=database.fatchTeacher();
		
		TeacherModal modal=fatchdetails( request, response,"");
		
		
		boolean check=database.insertTecher(modal);
		
		if (check) {
			
			request.setAttribute("reply", "Data added succeses");
			try {
				request.getRequestDispatcher("teacher.jsp").forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	public int autoSetId(ArrayList<TeacherModal>list,HttpServletRequest request, HttpServletResponse response) {
		
		int i=0;
		int setid=0;
		for ( i = 0; i < list.size()-1; i++);
		
		if (list.size()>0) {
			int id=list.get(i).getId();
			 setid=id+1;
			 
		}else {
			 setid=1;
			 
			 
		}
		
		return setid;
		
		
}

}
