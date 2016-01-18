package com.yunpan.entity;
/**
 * 文件信息实体类
 * @author pamgo
 * @version v1.0
 */
public class FileInfo {
	public FileInfo() {
	}
	
	private int id;
	
	private String filename;
	
	private long size;
	
	private String path; //文件存储的路径
	
	private int isshare; //是否已分享，默认为”1“未分享
	
	private int isfavorite; // 是否收藏 ，默认为“1”未收藏
	
	private long created_time; //上传时间
	
	private int create_user; //上传人
	
	private String change_time;

	private String show_pic;
	
	private String fileuser;
	
	public String getFileuser() {
		return fileuser;
	}

	public void setFileuser(String fileuser) {
		this.fileuser = fileuser;
	}

	public String getShow_pic() {
		return show_pic;
	}

	public void setShow_pic(String show_pic) {
		this.show_pic = show_pic;
	}

	public String getChange_time() {
		return change_time;
	}

	public void setChange_time(String change_time) {
		this.change_time = change_time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getIsshare() {
		return isshare;
	}

	public void setIsshare(int isshare) {
		this.isshare = isshare;
	}

	public int getIsfavorite() {
		return isfavorite;
	}

	public void setIsfavorite(int isfavorite) {
		this.isfavorite = isfavorite;
	}

	public long getCreated_time() {
		return created_time;
	}

	public void setCreated_time(long created_time) {
		this.created_time = created_time;
	}

	public int getCreate_user() {
		return create_user;
	}

	public void setCreate_user(int create_user) {
		this.create_user = create_user;
	}
	
}
