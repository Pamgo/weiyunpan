package com.yunpan.dao;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import com.yunpan.entity.DiskInfo;
import com.yunpan.entity.FileInfo;
import com.yunpan.entity.User;

/**
 * 磁盘操作接口
 * @author pamgo
 *
 */
public interface IDiskInfoDao {

	/**
	 * 获取用户的网盘使用情况
	 * @param diskInfo
	 * @return
	 */
	public DiskInfo load(int userid);
	
	/**
	 * 检查网盘是否已满
	 * @param myFile
	 * @return
	 */
	public boolean isEnoughSpace(FileInfo myFile);
	
	/**
	 * 更新用户网盘大小
	 * @param userid
	 * @return
	 */
	public boolean updateDiskSize(long used_size,int filenumber,int userid);
	
	/**
	 * 查询所有网盘信息
	 * @return
	 */
	public List<DiskInfo> findDiskInfo();
	
	/**
	 * 根据用户id更新网盘信息
	 * @param id
	 * @return
	 */
	public boolean updateDisk(long size,int id);
	
}
