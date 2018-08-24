import java.util.Scanner;

public class DemoClassString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String checkstr;
		System.out.println("Enter the string to perform operations on:");
		Scanner s=new Scanner(System.in);
		checkstr=s.next();
		System.out.println("String function 1: Print length of string:");
		System.out.println("Length of string is "+checkstr.length());
		System.out.println("String function 2: find substring of string: ");
		String substr=checkstr.substring(0, checkstr.length()-2);
		System.out.println("the substring of this string leaving 2 end characters is "+substr);
		System.out.println("String function 3: Check for the prefix");
		boolean flag=checkstr.startsWith("an");
		if (flag==true)
			System.out.println("yes the string starts with the prefix 'an'");
		else
			System.out.println("no the string does not start with this prefix");
		System.out.println("String function 4: find index of character 'a'");
		int index=checkstr.indexOf('a');
		if(index>=0)
		System.out.println("The index of the first occurence of the character is :"+index);
		else
			System.out.println("the character does not exist.");
		
		System.out.println("String function 5: Convert string to lower type:");
		checkstr=checkstr.toLowerCase();
		System.out.println("the converted string is "+checkstr);
		System.out.println("String function 6: replace the substring :");
        checkstr=checkstr.replace(substr, "radhi");		
        System.out.println("the converted string is "+checkstr);
		s.close();

	}

}
