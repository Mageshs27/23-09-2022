package com.collection.demo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class M04 extends ArrayList {
public static void main(String[] args) {
	

	M04 list=new M04();
	
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	list.add(6);
	list.add(7);
	list.add("magesh");
	list.add(true);
	list.add("abc");
	list.add("ZXY");
	list.add(4);
	list.add(5);
	list.add(6);
	list.add(7);
	list.add(8);
	
 list.removeRange(0, 8);
 
 System.out.println(list);
 
 list.set(0, "mageh");
 
// Collections.sort(list);
 
 System.out.println(list);
 
 Comparator comp= Collections.reverseOrder();
 
 Collections.sort(list,comp);
 
 System.out.println(list);
 
 
 
 
 
	
	
}

}
 
 

