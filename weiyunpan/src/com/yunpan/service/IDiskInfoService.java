package com.yunpan.service;

import java.util.List;

import com.yunpan.entity.DiskInfo;
import com.yunpan.entity.FileInfo;

/**
 * 网盘空间操作类
 * @author pamgo
 *
 */
public interface IDiskInfoService {

	/**
	 * 获取用户的网盘使用情况
	 * @param diskInfo
	 * @return
	 */
	public DiskInfo load(int userid);


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
