package edu.bit.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;



public class BDao {
	
	DataSource dataSource;
	
	public BDao(){
		
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public boolean checkEmp(String empno, String ename) {
		boolean result = false;
				Connection connection = null;
				PreparedStatement preparedStatement = null;
				ResultSet resultSet = null;
						
				try {
							
				 	connection = dataSource.getConnection();
					String query ="select count(*)as cnt from emp where ename = ? and empno = ?";
					preparedStatement = connection.prepareStatement(query);
					preparedStatement.setString(1, ename);
					preparedStatement.setInt(2, Integer.parseInt(empno));
					
					resultSet = preparedStatement.executeQuery();
							
					if(resultSet.next()) {
						int count = resultSet.getInt("cnt");
							
						if(count == 1)
							result =  true;
						}			
					} catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
					} finally {
						try {
							if(resultSet != null) resultSet.close();
							if(preparedStatement != null) preparedStatement.close();
							if(connection != null) connection.close();				
						}catch (Exception e2) {
							// TODO: handle exception
							e2.printStackTrace();
						}			
					}
				
				return result;
	}

}

