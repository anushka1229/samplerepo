import java.util.Scanner;

import com.pojo.Student;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks[]=new int[5];
        Student S=new Student("Anushka ", marks,2015);
        Scanner s=new Scanner(System.in);
        int n;
       // System.out.println("enter the number of subjects:");
        //n=s.nextInt();
        System.out.println("input marks of the student:");
        
        for(int i=0;i<5;i++)
        {
          marks[i]=s.nextInt();	
        }
        S.setMarks(marks);
        S.display();
	}

}