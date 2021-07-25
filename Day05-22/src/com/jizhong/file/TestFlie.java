package com.jizhong.file;

import java.io.File;
import java.util.Arrays;

public class TestFlie {
	public static void main(String[] args) {
		File a = new File("F:\\a");
		//list()：获取当前文件夹下的直接子文件和子文件夹名称
//		String[] fileNames = a.list();
//		System.out.println(Arrays.toString(fileNames));
//		for(int i = 0;i < fileNames.length;i++){
//			System.out.println(fileNames[i]);
//		}
		
		//listFiles()：获取当前文件夹下的直接子文件和文件夹的File类
//		File[] files = a.listFiles();
//		for(int i = 0;i < files.length;i++){
//			System.out.println(files[i].delete());
//		}
		//直接子文件 直接获取文件
		//子文件夹 获取子文件夹中的文件
		
//		a(1);//11403 //StackOverflowError：栈内存溢出异常
		getAllFileName(a);
		
		
	}
	//递归
	public static void getAllFileName(File file){//a文件夹
		File[] files = file.listFiles();
		for(int i = 0;i < files.length;i++){
			/**
			 * 判断这个文件是一个文件夹还是文件
			 * 		如果是文件夹，则进一步获取文件夹下文件
			 * 		如果是文件，则直接打印文件名称
			 */
			if(files[i].isDirectory()){
				getAllFileName(files[i]);
			}else{
				//String.endsWith()：字符串以什么结尾
				if(files[i].getName().endsWith(".java")){
					System.out.println(files[i].getName());
				}
			}
		}
	}
	
}
