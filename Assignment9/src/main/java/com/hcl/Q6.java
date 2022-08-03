package com.hcl;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student s = new Student(10, "Jane", "password", 15);
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("C:\\Users\\soltana.rasul\\practicesource2.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(s);
			System.out.println("Completed");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}catch (IOException e1) {
			e1.printStackTrace();
		}finally {
			try {
				fos.close();
				oos.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}	
		
	}

}
class Student implements Serializable{
	private static final long serialVersionUID = 2222L;
	
	private int id;
	private int name;
	private transient String password;
	private int age;
	
	public Student(int i, String string, String string2, int j) {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
