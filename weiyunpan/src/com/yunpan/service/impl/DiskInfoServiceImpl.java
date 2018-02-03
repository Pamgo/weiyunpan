package com.yunpan.service.impl;

import java.util.List;

import com.yunpan.dao.IDiskInfoDao;
import com.yunpan.dao.impl.DiskInfoDaoImpl;
import com.yunpan.entity.DiskInfo;
import com.yunpan.service.IDiskInfoService;

/**
 * 网盘操作类
 * @author pamgo
 * @version v1.0
 */
public class DiskInfoServiceImpl implements IDiskInfoService {

	/**
	 * 获取用户网盘使用情况
	 */
	@Override
	public DiskInfo load(int userid) {
		IDiskInfoDao diskInfoDao = new DiskInfoDaoImpl();
		return diskInfoDao.load(userid);
	}

	/**
	 * 根据用户上传文件更新网盘信息
	 */
	@Override
	public boolean updateDiskSize(long used_size, int filenumber,
			int userid) {
		IDiskInfoDao diskInfoDao = new DiskInfoDaoImpl();
		return diskInfoDao.updateDiskSize(used_size, filenumber, userid);
	}

	/**
	 * 查询网盘所有信息
	 */
	@Override
	public List<DiskInfo> findDiskInfo() {
		IDiskInfoDao diskInfoDao = new DiskInfoDaoImpl();
		return diskInfoDao.findDiskInfo();
	}

	/**
	 * 根据用户id更新网盘信息
	 */
	@Override
	public boolean updateDisk(long size, int id) {
		IDiskInfoDao diskInfoDao = new DiskInfoDaoImpl();
		return diskInfoDao.updateDisk(size, id);
	}
}
