import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoRead1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BufferedReader bf=new BufferedReader(new InputStreamReader(System.in)); //chaining
      try {
    	  System.out.println("enter the input string:");
		String str=bf.readLine();
		System.out.println("you entered\n"+str);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} //
	}

}
