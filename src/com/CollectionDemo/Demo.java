package com.CollectionDemo;

import java.util.HashMap;
import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		
		HashMap<String , String> m = new HashMap<String , String>();
		m.put("India", "Delhi");
		m.put("Bharath", "Delhi");
		m.put("UK", "London");
		m.put("US", "NewYork");
		System.out.println(m.get("India"));
		Iterator<String> itr =    m.keySet().iterator();
		while(itr.hasNext())
		{
			String key = itr.next();
			          String value =   m.get(key);
			          System.out.println(value);
		}
		
		
		
	}
}
