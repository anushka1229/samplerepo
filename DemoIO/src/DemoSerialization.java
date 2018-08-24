import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import com.pojo.Student;

public class DemoSerialization {

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new Student(12, 300, "abcd");
		//step 1- need an object for the file
		try {
			FileOutputStream fo=new FileOutputStream("student.txt");
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
		

	}

}
