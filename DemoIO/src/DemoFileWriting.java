import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
			FileWriter fw=new FileWriter("myfile.txt",true);//true is required for appending, by default it is not appendable
			fw.write("Hey this is Anushka Srivastava.\nI hope you know me.\n I am a smart and brilliant person with a good sense of humour.");
		    fw.write("I am feeling bored and I am not really hopeful about the upcoming dayss");
			System.out.println("File created and data inserted.");
		    fw.close();
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
