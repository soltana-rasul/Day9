package com.hcl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q1Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream source = null;
		FileOutputStream target = null;
		int temp = 0;
		
		try {
			try {
					source = new FileInputStream("C:\\Users\\soltana.rasul\\practicesource.png");
					target = new FileOutputStream("C:\\Users\\soltana.rasul\\practicetarget.png");
					
					while ((temp = source.read()) != -1) {
						target.write((byte) temp);
					}
					System.out.println("Complete");
					
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (source != null) {
					source.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
