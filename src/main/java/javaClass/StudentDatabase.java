package javaClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modal.StudentModal;

public class StudentDatabase {
	Connection conn=null;
	DataBaseConn dataBaseConn=new DataBaseConn();
    PreparedStatement pstatement=null;
    Statement statement=null;
	
	public boolean insertStudentInfo(StudentModal modal) {
		
		conn=dataBaseConn.CheckConn();
		if (conn!=null) {
			
			try {
				
			
			
			String query="insert into student_table(student_id,student_fname,student_lname,student_dob,student_gender,student_address,student_parentcontect,student_information,"
					+ "student_enrollmentdob,student_grade) values(?,?,?,?,?,?,?,?,?,?)";
			
			
			try {
				pstatement=conn.prepareStatement(query);
				
				pstatement.setInt(1,modal.getStudent_id());
				pstatement.setString(2, modal.getStudent_fname());
				pstatement.setString(3,modal.getStudent_lname() );
				pstatement.setString(4,modal.getStudent_dob() );
				pstatement.setString(5,modal.getStudent_gender() );
				pstatement.setString(6,modal.getStudent_address() );
				pstatement.setString(7,modal.getStudent_parentcontect() );
				pstatement.setString(8,modal.getStudent_information() );
				pstatement.setString(9, modal.getStudent_enrollmentdob());
				pstatement.setString(10, modal.getStudent_grade());
				
				
				pstatement.execute();
				
				System.out.println("data insrted");
				conn.close();
				
				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("data not insertd"+ e.getMessage());
			}
			}catch (Exception e) {
			  System.out.println(e.getMessage());
				
			}
			
			
		}
		return false;
		
	}
	
	
	public ArrayList<StudentModal>  fatchStudent(){
		ArrayList<StudentModal>studentList=new ArrayList<StudentModal>();
		
		conn=dataBaseConn.CheckConn();
		
		if (conn!=null) {
			
			String query="select * from student_table";
			
			try {
				statement=conn.createStatement();
				
				ResultSet resultSet=statement.executeQuery(query);
				
				while(resultSet.next()) {
				
					
				
						int id=resultSet.getInt(1);
				        String  fname=resultSet.getString(2);
				        String  lname=resultSet.getString(3);
				        String  dob=resultSet.getString(4);
				        String  gender=resultSet.getString(5);
				        String  address=resultSet.getString(6);
				        String  contect=resultSet.getString(7);
				        String  information=resultSet.getString(8);
				        String  enrollmentdob=resultSet.getString(9);
				        String  grade=resultSet.getString(10);
				         
				        StudentModal modal=new StudentModal(id,fname,lname,dob,gender,address,contect,information,enrollmentdob,grade);
				        studentList.add(modal);
				        
				        System.out.println(id);
						
						
						
				}
				
				resultSet.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
			
		}
		
		return studentList;
		}
	
	
	public void updateStudent(StudentModal modal,int student_id) throws Exception {
		
		conn=dataBaseConn.CheckConn();
		
		if (conn!=null) {
			
		
		
		String query="update student_table set student_id=?,student_fname=?,student_lname=?,student_dob=?,student_gender=?,student_address=?,student_parentcontect=?,student_information=?,student_enrollmentdob=?,student_grade=? where student_id="+student_id;
		
		
		pstatement=conn.prepareStatement(query);
		pstatement.setInt(0, modal.getStudent_id());
		pstatement.setString(1, modal.getStudent_fname());
		pstatement.setString(2, modal.getStudent_lname());
		pstatement.setString(3, modal.getStudent_dob());
		pstatement.setString(4, modal.getStudent_gender());
		pstatement.setString(5, modal.getStudent_address());
		pstatement.setString(6, modal.getStudent_parentcontect());
		pstatement.setString(7, modal.getStudent_information());
		pstatement.setString(8, modal.getStudent_enrollmentdob());
		pstatement.setString(9, modal.getStudent_grade());
		
		
		pstatement.executeUpdate();
		
		System.out.println("data updated success");
		
		}
		pstatement.close();
		conn.close();
		
	}
	
	
	public boolean deleteStudent(int id) {
		conn=dataBaseConn.CheckConn();
		
		if (conn!=null) {
			
			String query="delete from student_table where student_id="+id;
			try {
				statement=conn.createStatement();
				statement.execute(query);
				
				statement.close();
				conn.close();
				return true;
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
				return false;
			}
			
			
			
		}
		
		return false;
	}
	
	
		
	

}
