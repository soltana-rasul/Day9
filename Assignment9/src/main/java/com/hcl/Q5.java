package com.hcl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader source = null;
		BufferedWriter target = null;
		
			try {
					Reader r = new FileReader("C:\\Users\\soltana.rasul\\practicesource1.png");
					source = new BufferedReader(r);
					String line = null;
					
					File outFile = new File("C:\\Users\\soltana.rasul\\practicetarget1.png");
					Writer w = new FileWriter(outFile);
					target = new BufferedWriter(w);
					
					while ((line = source.readLine()) != null) {
						target.write((line) );
						target.flush();
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
