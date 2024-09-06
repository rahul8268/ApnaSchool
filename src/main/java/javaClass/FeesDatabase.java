package javaClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modal.FeesModal;

public class FeesDatabase {
	
	DataBaseConn connection=new DataBaseConn();
	Connection conn;
	PreparedStatement pStatement=null;
	Statement statement=null;
	public boolean insertFees(FeesModal modal) {
		
	
		conn=connection.CheckConn();
		
		if(conn!=null) {
			
			String queryString="insert into fees_table(id,name,course,amount,paymentDate,paymentMethod) values(?,?,?,?,?,?)";
			
			try {
				pStatement=conn.prepareStatement(queryString);
				pStatement.setInt(1,modal.getId());
				pStatement.setString(2, modal.getName());
				pStatement.setString(3, modal.getCourse());
				pStatement.setString(4, modal.getAmount());
				pStatement.setString(5, modal.getPaymentDate());
				pStatement.setString(6, modal.getPaymentMethod());
		
				
				pStatement.execute();
				
				return true;
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		return false;
		
	}
	
	
	public ArrayList<FeesModal>fatchFees(){
		
		ArrayList<FeesModal>list=new ArrayList<FeesModal>();
		
	conn=connection.CheckConn();
	if (conn!=null) {
		
		String sqlString="select * from fees_table";
		
		try {
			statement=conn.createStatement();
			
		ResultSet resultSet=statement.executeQuery(sqlString);
		
		while (resultSet.next()) {
			int id=resultSet.getInt(1);
			String nameString=resultSet.getString(2);
			String course=resultSet.getString(3);
			String amount=resultSet.getString(4);
			String paymentDate=resultSet.getString(5);
			String paymentMethod=resultSet.getString(6);
			
			FeesModal modal =new FeesModal(id, nameString, course, amount, paymentDate, paymentMethod);
			
       list.add(modal);
		
		}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	System.out.println("listsize is ="+list.size());
	
	return list;
		
	}
	
	
	public boolean updateFees(FeesModal modal,int id) {
		
		conn=connection.CheckConn();
		
		if (conn!=null) {
			
			String queryString="update fees_table set id=?,name=?,course=?,amount=?,paymentDate=?,paymentMethod=? where id="+id;
			
			try {
				pStatement=conn.prepareStatement(queryString);
				pStatement.setInt(1, modal.getId());
				pStatement.setString(2, modal.getName());
				pStatement.setString(3, modal.getCourse());
				pStatement.setString(4, modal.getAmount());
				pStatement.setString(5, modal.getPaymentDate());
				pStatement.setString(6, modal.getPaymentMethod());
				
				pStatement.executeUpdate();
				
				return true;
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
		}
		return false;
		
	}

}
