import java.io.File;
import java.io.IOException;

public class DemoFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           File myFile=new File("myfile.txt");
           try {
			myFile.createNewFile();
			File mfile=new File("hellodear.py");
			mfile.createNewFile();
			boolean flag=myFile.canExecute();
			System.out.println(flag);
			System.out.println(myFile.getAbsolutePath());
			 System.out.println("file created successfully.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          
           
	}

}
