package com.one;

import java.util.ArrayList;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList list=new ArrayList();
   list.add(10);
   list.add(new Integer(34));
   list.add(10);
   list.add(new Integer(44));
   list.add(2,2000);
   
   System.out.println("number of elements is "+list.size());
   System.out.println(list);
   list.remove(2);
   System.out.println(list);
   list.remove(new Integer(10));
   System.out.println(list);
	}

}