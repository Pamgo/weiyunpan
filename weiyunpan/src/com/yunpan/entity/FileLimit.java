package com.yunpan.entity;

/**
 * 文件限制信息
 * @author pamgo
 *
 */
public class FileLimit {
	
	private int id;
	
	private long fileSize; //上传文件大小
	
	private long allfileSize; //上传总文件大小
	
	private String fileType; //允许上传文件类型
	
	private String deniedType; //禁止上传文件类型

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getFileSize() {
		return fileSize;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

	public long getAllfileSize() {
		return allfileSize;
	}

	public void setAllfileSize(long allfileSize) {
		this.allfileSize = allfileSize;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getDeniedType() {
		return deniedType;
	}

	public void setDeniedType(String deniedType) {
		this.deniedType = deniedType;
	}
}
