

import com.pojoexercises.Circle;
import com.pojoexercises.Rectangle;
import com.pojoexercises.Shape;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Shape s=new Circle(4.0);
       double a = s.area();
       System.out.println("Area of a circle with radius 4.0 is "+a);
       Shape s1=new Rectangle(12,12);
       double a1=s1.area();
       String name=s1.getName();
       System.out.println("Area of a rectangle is "+a1+" "+name);
       
       
	}

}
