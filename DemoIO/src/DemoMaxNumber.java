import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two numbers:");
		try{
			String num1= br.readLine();
			String num2= br.readLine();
			int n1=Integer.parseInt(num1);
			int n2=Integer.parseInt(num2);
			int maxim=Math.max(n1, n2);
			System.out.println("maximum number is: "+maxim);
			if(n1>n2)
				System.out.println("maximum number is "+n1);
			else
				System.out.println("maxiimum number is "+n2);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}

}