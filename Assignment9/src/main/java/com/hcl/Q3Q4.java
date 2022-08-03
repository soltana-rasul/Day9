package com.hcl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q3Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader source = null;
		FileWriter target = null;
		
		try {
			try {
					source = new FileReader("C:\\Users\\soltana.rasul\\practicesource.png");
					target = new FileWriter("C:\\Users\\soltana.rasul\\practicetarget.png");
					
					int c = 0;
					
					while ((c = source.read()) != -1) {
						target.write((c) );
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
