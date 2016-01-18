
package com.yunpan.test;

import org.junit.Test;

import com.yunpan.util.FileStorage;

public class StoreTest {
	
	@Test
	public void testFilepath(){
		System.out.println(FileStorage.getRealPath());
	}
	@Test
	public void testfileRealPath(){
		System.out.println(FileStorage.getFileRealPath());
	}
	@Test
	public void testimagepath(){
		System.out.println(FileStorage.getImagePath());
	}
	@Test
	public void testimageRealpath(){
		System.out.println(FileStorage.getImageRealPath());
	}
}
