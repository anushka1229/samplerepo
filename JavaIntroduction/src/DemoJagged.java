import java.util.Arrays;

public class DemoJagged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[][] values=new int[3][];
     
     values[0]=new int[4];
     values[1]=new int[5];
     values[2]=new int[3];
     Arrays.fill(values[0],100);
     Arrays.fill(values[1],190);
     Arrays.fill(values[2],100);
     values[0][0]=23;
     values[2][1]=233;
     values[1][2]=611;
     values[1][4]=90;
     for(int[] x:values)
     {
  	   for (int y:x)
  	   {
  		   System.out.print(y+"\t");
  	   }
  		System.out.print("\n");   
     }
     System.out.println("hey!");
	}
	}
