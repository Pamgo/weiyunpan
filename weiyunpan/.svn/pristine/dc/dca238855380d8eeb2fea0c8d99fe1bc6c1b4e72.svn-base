package com.yunpan.service;

import java.util.List;

import com.yunpan.entity.Favorinfo;
import com.yunpan.entity.FileInfo;

/**
 * 收藏操作业务接口
 * @author pamgo
 *
 */
public interface IFavorinfoService {
	
	/**
	 * 根据当前用户收藏文件
	 * @param favorinfo
	 * @param userid
	 * @return
	 */
	public boolean addFavor(int userid,FileInfo fileInfo);
	
	/**
	 * 根据用户id查询所有收藏
	 * @param userid
	 * @return
	 */
	public List<Favorinfo> findByuserid(int userid);

	/**
	 * 根据用户id联合查询
	 * @param fileid
	 * @param userid
	 * @return
	 */
	List<FileInfo> findByFileidAndUserid(int userid);
	
	/**
	 * 根据文件id取消相应文件的收藏
	 * @param fileid
	 * @return
	 */
	public boolean cancelFileFavor(int userid,int fileid);
}
