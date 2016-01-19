package com.yunpan.entity;

/**
 * 文件限制信息
 * @author pamgo
 *
 */
public class FileLimit {
	
	private int id;
	
	private String fileSize; //上传文件大小
	
	private String allfileSize; //上传总文件大小
	
	private String fileType; //允许上传文件类型
	
	private String deniedType; //禁止上传文件类型

	
	public String getFileSize() {
		return fileSize;
	}

	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}

	public String getAllfileSize() {
		return allfileSize;
	}

	public void setAllfileSize(String allfileSize) {
		this.allfileSize = allfileSize;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
