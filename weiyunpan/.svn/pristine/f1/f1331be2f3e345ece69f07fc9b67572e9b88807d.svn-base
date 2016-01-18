package com.yunpan.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 数据库操作工具
 * @author alison
 * @version 1.0
 *
 */
public class DBUtil {
	
	/**
	 * 从c3p0数据库连接池中获取数据库链接对象
	 * @return
	 */
	public static Connection getConnection(){
		Connection conn = null;
		try{
			// 从数据连接池中获取数据库链接对象
			conn = ConnectionManager.getInstance().getConnection();
		}catch(Exception e){
			e.printStackTrace();
		}
		return conn;
	}
	
	/**
	 * 开启事务
	 */
	public static void startTransaction(){
		Connection conn = getConnection();
		if(conn == null){
			conn = ConnectionManager.getInstance().getConnection();
		}
		try {
			conn.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 事务提交
	 */
	public static void commit(){
		Connection conn = getConnection();
		if(conn != null){
			try {
				conn.commit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 事务回滚
	 */
	public static void rollback(){
		Connection conn = getConnection();
		if(conn != null){
			try {
				conn.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	/**
	 * 增删改通用方法
	 * @param sql
	 * @param object
	 * @return
	 */
	public static int executeUpdate(String sql,Object... objects){
		int result = 0;
		Connection conn = null;
		PreparedStatement psmt = null;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(sql);
			if(objects != null){
				for(int i = 0; i < objects.length; i++){
					psmt.setObject(i+1, objects[i]);
				}
			}
			result = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			close(conn, psmt, null);
		}
		return result;
	}
	
	/**
	 * 查询通用方法
	 * @param sql
	 * @param rsHandler
	 * @param objects
	 * @return
	 */
	public static Object executeQuery(String sql,IResultSetUtil rsHandler,
			Object...objects){
		Connection conn = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try{
			conn = getConnection();
			preparedStatement = conn.prepareStatement(sql);
			if(objects != null){
				for(int i = 0; i < objects.length; i++){
					preparedStatement.setObject(i+1, objects[i]);
				}
			}
			resultSet = preparedStatement.executeQuery();
			return rsHandler.doHandler(resultSet);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			close(conn, preparedStatement, resultSet);
		}
		return null;
	}
	
	/**
	 * 查询单个字段值通用的方法
	 * @param sql
	 * @param objects
	 * @return
	 */
	public static Object executeQuery(String sql, Object... objects){
		return executeQuery(sql, new IResultSetUtil(){
			@Override
			public Object doHandler(ResultSet rs) throws SQLException {
				Object object = null;
						if(rs.next()){
							object = rs.getObject(1);
						}
				return object;
			}
		},objects );
	}

	/**
	 * 释放资源
	 * @param connection
	 * @param psmtStatement
	 * @param resultSet
	 */
	public static void close(Connection connection , 
			PreparedStatement psmtStatement,ResultSet resultSet){
		try {
			if(resultSet != null){
				resultSet.close();
			}
			if(psmtStatement != null){
				psmtStatement.close();
			}
			if(connection != null){
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
