package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import javaClass.FeesDatabase;
import modal.FeesModal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;


public class FeesUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	FeesServlet servlet=new FeesServlet();
	 FeesDatabase database=new FeesDatabase();
	 ArrayList<FeesModal>list= database.fatchFees();
   
    public FeesUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
	
	 

	
	String idString=request.getParameter("student-id");
	int ids=Integer.parseInt(idString);
	  System.out.println(list.size());
	for (int i = 0; i < list.size(); i++) {
		
		System.out.println("the ids="+ids + "and id="+list.get(i).getId());
		if (ids==list.get(i).getId()) {
			
			request.setAttribute("student", list.get(i).getId());
			request.setAttribute("studentName", list.get(i).getName());
			request.setAttribute("course", list.get(i).getCourse());
			
			 
			
	
		}
		else {
			
			request.setAttribute("reply", "data Not Exist");
		}
		
		request.getRequestDispatcher("feesUpdate.jsp").forward(request, response);
		
	}
		
		
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		System.out.println("i am update servlet");
		
		String btnString=request.getParameter("button");
		
		if ("fpay".equals(btnString)) {
			request.getRequestDispatcher("feesUpdate.jsp").forward(request, response);
		}else if ("fsubmit".equals(btnString)) {
			
			FeesModal modal=fatchFeesModal(request);
			
			database.updateFees(modal, modal.getId());
		}
		
		
		
		
	}
	
	
	
	
  public FeesModal fatchFeesModal(HttpServletRequest request) {
	  
	  String idString=request.getParameter("id");
		int id=0;
		if (!idString.equals("")) {
			
			id=Integer.parseInt(idString);
			
		}
		String studentName=request.getParameter("studentName");
		String course=request.getParameter("course");
		String paymentDate=request.getParameter("paymentDate");
		String paymentAmount=request.getParameter("paymentAmount");
		int finalAmount=0;
		for (int i = 0; i < list.size(); i++) {
			
			if (id==list.get(i).getId()) {
				
			  String amountString =list.get(i).getAmount();
			   finalAmount =(Integer.parseInt(amountString))+(Integer.parseInt(paymentAmount));
			}
			
		}
		
		String paymentMethod=request.getParameter("paymentMethod");
		
		FeesModal modal=new FeesModal(id, studentName, course, String.valueOf(finalAmount), paymentDate, paymentMethod);
		 
		 
		return modal;
	  
	  
	  
	  
  }
}
