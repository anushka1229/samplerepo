
public class DemoCommandLine {
  public static void main(String[] args)
  {
	  System.out.println("num of arguments is "+args.length);
	  System.out.println("the values are "+args[0]+" "+args[1]+" "+args[2]+ " "+args[3]);
	  int sum=0;
	  for(String str:args)
	  {
		  
		sum+=Integer.parseInt(str);
	  }
	  System.out.println(sum);
  }
}
