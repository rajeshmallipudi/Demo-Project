package com.qa.test;

import java.util.ArrayList;
import java.util.Iterator;
public class ClassB extends ClassA{
	
	/*static ArrayList<String> blood;
	
	public static void main(String[] args) {
		
		blood = ClassA.sandy();
		
		blood.add("nagbabu");
		
		//System.out.println(blood);
		
		Iterator<String>it=blood.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());	
			
		}
		
	}*/
	
	public static void main(String[] args) {
		
		ArrayList asd=new ArrayList<>();
		asd=ClassA.sandeep();
		asd.add(20);
		
		Iterator it=asd.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());	
		}
	}

}