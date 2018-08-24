import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.interfaces.StudentIO;
import com.interfaces.StudentUserIO;
import com.pojo.Student;

public class DemoUser implements StudentIO, StudentUserIO{



	@Override
	public Student[] readStudents() {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fi=new FileInputStream("student1.txt");
			ObjectInputStream oi=new ObjectInputStream(fi);
			Object obj=oi.readObject();
			Student[] stu=(Student[])obj;
			oi.close();
			fi.close();
			return stu;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return null;
	}

	@Override
	public int writeStudents(Student[] st) {
		// TODO Auto-generated method stub
	
		//step 1- need an object for the file
		try {
			FileOutputStream fo=new FileOutputStream("student1.txt");
			ObjectOutputStream oo= new ObjectOutputStream(fo);
            oo.writeObject(st);
            System.out.println("file created");
			//please close all objects
            oo.close();
            fo.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


		return 0;
	}

	@Override
	public Student[] readFromUser() {
		// TODO Auto-generated method stub
		Student[] students=new Student[2];
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter details of 5 objects:");
		for(int i=0;i<2;i++)
		{
	
			System.out.println("Enter rollnumber:");
			int n=s.nextInt();
			System.out.println("Enter total marks:");
			int m=s.nextInt();
			System.out.println("Enter name:");
			String str=s.next();
			students[i]=new Student(n, m, str);
		}
//		s.close();
		return students;
	}

	@Override
	public void writeToUser(Student[] students) {
		// TODO Auto-generated method stub
		System.out.println("the objects mentioned by the user are:");
		for(int i=0;i<students.length;i++)
		{
			System.out.println("name: "+students[i].getName());
			System.out.println("roll number: "+students[i].getRollno());
			System.out.println("total marks: "+students[i].getTotal());
		}
	}
        
}
