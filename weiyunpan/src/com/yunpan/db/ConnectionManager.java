package com.yunpan.db;

import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mchange.v2.c3p0.DataSources;

/**
 * 数据库连接对象管理类
 * @author alison
 * @version 1.0
 *
 */
public class ConnectionManager {
	private static ConnectionManager instance;
	
	//c3p0的连接池对象
	private ComboPooledDataSource ds;
	
	public ConnectionManager() {
		ds = new ComboPooledDataSource("mysql");
	}
	
	/**
	 * 单例模式获取数据库链接对象
	 * @return
	 */
	public static final ConnectionManager getInstance(){
		if(instance == null){
			try{
				instance = new ConnectionManager();
			}catch(Exception e){
				e.printStackTrace();
				}
		}
		return instance;
	}
	
	/**
	 * 为了线程安全，同步
	 * @return
	 */
	public synchronized final Connection getConnection(){
		
		try{
			return ds.getConnection();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	protected void finalize() throws Throwable {
		DataSources.destroy(ds);
		super.finalize();
	}
}
