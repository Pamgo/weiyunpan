package com.yunpan.test;

import org.junit.Test;

import com.yunpan.dao.IDiskInfoDao;
import com.yunpan.dao.IFavorinfoDao;
import com.yunpan.dao.IFileInfoDao;
import com.yunpan.dao.impl.DiskInfoDaoImpl;
import com.yunpan.dao.impl.FavorinfoDaoImpl;
import com.yunpan.dao.impl.FileInfoDaoImpl;
import com.yunpan.db.DBUtil;
import com.yunpan.service.IFileInfoService;
import com.yunpan.util.StringHelper;

public class DBUtilTest {
	@Test
	public void testConnection(){
		System.out.println(DBUtil.getConnection());
	}
	@Test
	public void testexecuteQuery(){
		IFavorinfoDao dao = new FavorinfoDaoImpl();
		//System.out.println(dao.findByFileidAndUserid((49), 20));
	}
	@Test
	public void testlong(){
		IDiskInfoDao dao = new DiskInfoDaoImpl();
		System.out.println(dao.load(19).getUsed_size());
	}
	@Test
	public void testlong2(){
		System.out.println(DBUtil.executeQuery("select used_size from yp_diskinfo where disk_userid = ?", 19));
	}
}
