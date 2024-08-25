package javaClass;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modal.TeacherModal;

public class TeacherDatabase {
	
	Connection connection=null;
	PreparedStatement preparedStatement=null;
	Statement statement=null;
	DataBaseConn conn=new DataBaseConn();
	
	
	public boolean insertTecher(TeacherModal modal) {
		
		
		connection=conn.CheckConn();
		
		
		if (connection!=null) {
			
//			String query="insert into teacher_table(id,fName,lName,dob,gender,address,contectNumber,"
//					+ "hireDate,department,subjectTaught,classSedule,attendecRecode) values(?,?,?,?,?,?,?,?,?,?,?,?)";
			
			String query="insert into teacher_table(id,fname,lname,dob,gender,address,contectNumber,hireDate,"
					+ "department,subjectTaught,classSchedule,attendaceRecode) values(?,?,?,?,?,?,?,?,?,?,?,?)";
			
			
			try {
				preparedStatement=connection.prepareStatement(query);
				preparedStatement.setInt(1,modal.getId());
				preparedStatement.setString(2, modal.getFirstName());
				preparedStatement.setString(3, modal.getLastName());
				preparedStatement.setString(4, modal.getDob());
				preparedStatement.setString(5, modal.getGender());
				preparedStatement.setString(6, modal.getAddress());
				preparedStatement.setString(7, modal.getContectNumber());
				preparedStatement.setString(8, modal.getHireDate());
				preparedStatement.setString(9, modal.getDepartment());
				preparedStatement.setString(10, modal.getSubjectTaught());
				preparedStatement.setString(11, modal.getClassSedule());
				preparedStatement.setString(12, modal.getAttendecRecode());
				
				preparedStatement.execute();
				
			
				
				System.out.println("data insrted");
				
				preparedStatement.close();
				connection.close();
				

				return true;
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("data not insrte"+e.getMessage());
				e.printStackTrace();
			}
			
		}
		return false;
		

		}
	
	
	public ArrayList<TeacherModal> fatchTeacher() {
		
		ArrayList<TeacherModal>list=new ArrayList<TeacherModal>();
		
		connection=conn.CheckConn();
		
		if (connection!=null) {
			
			String query="select * from teacher_table";
			
			try {
				statement=connection.createStatement();
				ResultSet resultSet=statement.executeQuery(query);
				
				while (resultSet.next()) {
					
					int id=resultSet.getInt(1);
					String fName=resultSet.getString(2);
					String lName=resultSet.getString(3);
					String dob=resultSet.getString(4);
					String gender=resultSet.getString(5);
					String address=resultSet.getString(6);
					String contectNumber=resultSet.getString(7);
					String hireDate=resultSet.getString(8);
					String department=resultSet.getString(9);
					String subjectTaught=resultSet.getString(10);
					String classSedule=resultSet.getString(11);
					String attandace=resultSet.getString(12);
					
					TeacherModal modal=new TeacherModal(id,fName,lName,dob,gender,address,contectNumber,hireDate,department,subjectTaught,classSedule,attandace);
					
					list.add(modal);
					
					
					
				}
				
				 resultSet.close();
				 statement.close();
				 connection.close();
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		return list;
		
		
	}
	
	public boolean updateTeacher(TeacherModal modal,int id) throws SQLException  {
		
		connection=conn.CheckConn();
		
		if (connection!=null) {
			
			String query="update teacher_table set id=?,fName=?,lName=?,dob=?,gender=?,address=?,contectNumber=?,hireDate=?,department=?,subjectTaught=?"
					+ ",classSchedule=?,attendaceRecode=? where id="+id;
			preparedStatement=connection.prepareStatement(query);
		
			preparedStatement.setInt(1, modal.getId());
			preparedStatement.setString(2, modal.getFirstName());
			preparedStatement.setString(3, modal.getLastName());
			preparedStatement.setString(4, modal.getDob());
			preparedStatement.setString(5, modal.getGender());
			preparedStatement.setString(6, modal.getAddress());
			preparedStatement.setString(7, modal.getContectNumber());
			preparedStatement.setString(8, modal.getHireDate());
			preparedStatement.setString(9, modal.getDepartment());
			preparedStatement.setString(10, modal.getSubjectTaught());
			preparedStatement.setString(11, modal.getClassSedule());
			preparedStatement.setString(12, modal.getAttendecRecode());
			
			preparedStatement.execute();
			
			preparedStatement.close();
			connection.close();
			return true;
			
		}
		return false;
	}
	
	public boolean deleteTeacher(int id) {
		connection=conn.CheckConn();
		
		if (conn!=null) {
			
			String query="delete from teacher_table where id="+id;
			
			try {
				statement=connection.createStatement();
				statement.execute(query);
				
				statement.close();
				connection.close();
				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

		return false;
	}
}
