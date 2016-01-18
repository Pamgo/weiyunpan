package com.yunpan.service.impl;

import java.util.List;

import com.yunpan.dao.IFavorinfoDao;
import com.yunpan.dao.impl.FavorinfoDaoImpl;
import com.yunpan.entity.Favorinfo;
import com.yunpan.entity.FileInfo;
import com.yunpan.service.IFavorinfoService;

/**
 * 收藏操作业务接口类
 * @author pamgo
 *
 */
public class FavorinfoServiceImpl implements IFavorinfoService {

	/**
	 * 收藏文件
	 */
	@Override
	public boolean addFavor(int userid,FileInfo fileInfo) {
		IFavorinfoDao favorinfoDao = new FavorinfoDaoImpl();
		return favorinfoDao.addFavor(userid,fileInfo);
	}

	/**
	 * 根据用户id查询所有收藏
	 */
	@Override
	public List<Favorinfo> findByuserid(int userid) {
		IFavorinfoDao favorinfoDao = new FavorinfoDaoImpl();
		return favorinfoDao.findByuserid(userid);
	}

	/**
	 * 根据用户id联合查询
	 * @param fileid
	 * @param userid
	 * @return
	 */
	@Override
	public List<FileInfo> findByFileidAndUserid(int userid) {
		IFavorinfoDao favorinfoDao = new FavorinfoDaoImpl();
		return favorinfoDao.findByFileidAndUserid(userid);
	}

	/**
	 * 根据文件id取消相应文件的收藏
	 */
	@Override
	public boolean cancelFileFavor(int userid,int fileid) {
		IFavorinfoDao favorinfoDao = new FavorinfoDaoImpl();
		return favorinfoDao.cancelFileFavor(userid,fileid);
	}

}
