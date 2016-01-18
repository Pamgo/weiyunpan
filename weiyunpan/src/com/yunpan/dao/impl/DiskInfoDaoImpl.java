package com.yunpan.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yunpan.dao.IDiskInfoDao;
import com.yunpan.db.DBUtil;
import com.yunpan.db.IResultSetUtil;
import com.yunpan.entity.DiskInfo;
import com.yunpan.entity.FileInfo;

/**
 * 网盘操作类
 * @author pamgo
 * @version v1.0
 */
public class DiskInfoDaoImpl implements IDiskInfoDao {

	/**
	 * 获取用户网盘使用情况
	 */
	@Override
	public DiskInfo load(int userid) {
		String sql = "select disk_userid,total_size,used_size,filenumber from yp_diskinfo where disk_userid = ?";
		return (DiskInfo) DBUtil.executeQuery(sql, new IResultSetUtil() {
			@Override
			public Object doHandler(ResultSet rs) throws SQLException {
				DiskInfo diskInfo = new DiskInfo();
				while(rs.next()){
					diskInfo.setDisk_userid(rs.getInt(1));
					diskInfo.setTotal_size(rs.getLong(2));
					diskInfo.setUsed_size(rs.getLong(3));
					diskInfo.setFilenumber(rs.getInt(4));
				}
				return diskInfo;
			}
		}, userid);
	}

	/**
	 * 检查网盘空间是否满
	 */
	@Override
	public boolean isEnoughSpace(FileInfo myFile) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * 更新用户网盘信息
	 */
	@Override
	public boolean updateDiskSize(long used_size,int filenumber,int userid) {
		String sql = "update yp_diskinfo set used_size = ? , filenumber = ? where disk_userid = ?";
		return DBUtil.executeUpdate(sql,used_size,filenumber,userid) > 0;
	}

	/**
	 * 查询网盘所有信息
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<DiskInfo> findDiskInfo() {
		String sql = "select id,disk_userid,total_size,used_size,filenumber,diskuser from yp_diskinfo";
		return (List<DiskInfo>) DBUtil.executeQuery(sql, new IResultSetUtil() {
			List<DiskInfo> diskInfos = new ArrayList<DiskInfo>();
			@Override
			public Object doHandler(ResultSet rs) throws SQLException {
				while(rs.next()){
					DiskInfo diskInfo = new DiskInfo();
					diskInfo.setId(rs.getInt(1));
					diskInfo.setDisk_userid(rs.getInt(2));
					diskInfo.setTotal_size(rs.getLong(3));
					diskInfo.setUsed_size(rs.getLong(4));
					diskInfo.setFilenumber(rs.getInt(5));
					diskInfo.setDiskuser(rs.getString(6));
					diskInfos.add(diskInfo);
				}
				return diskInfos;
			}
		});
	}

	/**
	 * 根据网盘用户id更新网盘信息
	 */
	@Override
	public boolean updateDisk(long size,int id) {
		String sql = "update yp_diskinfo set total_size = ? where disk_userid = ?";
		return DBUtil.executeUpdate(sql,size, id) > 0;
	}
}
