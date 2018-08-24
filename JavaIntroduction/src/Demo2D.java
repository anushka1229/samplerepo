
public class Demo2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[][] arrays;
       arrays =new int[3][3];
       arrays[0][0]=1;
       arrays[1][0]=3;
       arrays[2][2]=8;
       for(int[] x:arrays)
       {
    	   for (int y:x)
    	   {
    		   System.out.print(y);
    	   }
    		System.out.print("\n");   
       }
	}

}
