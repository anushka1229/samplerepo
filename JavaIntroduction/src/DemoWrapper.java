
public class DemoWrapper {
public static void main(String[] args) {
	Integer obj1=new Integer(10);
	int val=obj1.intValue();
	System.out.println(val);
	int data=obj1; //auto unboxing
	obj1=200; //auto boxing
}
}
