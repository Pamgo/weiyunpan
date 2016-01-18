package com.yunpan.service;

import com.yunpan.entity.FoldlerInfo;

/**
 * 操作文件夹业务接口
 * @author pamgo
 *
 */
public interface IFoldlerInfoService {

	/**
	 * 根据用户id查询文件夹信息
	 * @param userid
	 * @return
	 */
	public FoldlerInfo findByUserName(int userid);
}
