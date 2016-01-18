package com.yunpan.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 获取文件目录工具类
 * @author pamgo
 * @version 1.0
 */
public class FileStorage {

	/**
	 * 获得文件的真是目录
	 * @return String
	 */
	public static String getRealPath(){
		
		return getProperties().getProperty("file_path");
	}
	
	/**
	 * 获取每个用户所属的文件夹的位置
	 * @return String
	 */
	public static String getFileRealPath(){
		return getProperties().getProperty("fileReal_path");
	}
	
	/**
	 * 获取每个用户所属的图片文件夹的位置
	 * @return String
	 */
	public static String getImagePath(){
		return getProperties().getProperty("image_path");
	}
	
	/**
	 * 获取图片的绝对路径
	 * @return
	 */
	public static String getImageRealPath(){
		return getProperties().getProperty("imageReal_path");
	}
	
	/**
	 * 获得配置文件的信息
	 * @return props
	 */
	private static Properties getProperties(){
		InputStream input = FileStorage.class.getClassLoader().getResourceAsStream("storage.properties");
		Properties props = new Properties();
		try {
			props.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props;
	}
}
