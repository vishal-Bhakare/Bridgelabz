package com.Bridgelabz.List_Store_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListStoreMAp {

	public static void main(String[] args) {

		List<String> li = new ArrayList<String>();
		li.add("VISHAL");
		li.add("SAURABH");
		li.add("SAHIL");
		li.add("BALRAM");

		List<String> lis = new ArrayList<String>();
		lis.add("KESHAV");
		lis.add("AKSHAY");
		lis.add("RAJAS");
		lis.add("GOPAL");

		List<String> list = new ArrayList<String>();
		list.add("VICKY");
		list.add("GUDDU");
		list.add("GOLLU");
		list.add("SAI");

		Map<String, List<String>> map = new HashMap<String, List<String>>();

		map.put("LIST 1: ", li);
		map.put("LIST 2: ", lis);
		map.put("LIST 3:", list);
		System.out.println(map);

		Set<String> keys = map.keySet();
		Iterator<String> itr = keys.iterator();

		while (itr.hasNext()) {

			String next = itr.next();

			List<String> list2 = map.get(next);

			System.out.println(list2);

			for (String l : list2) {
				System.out.println(l);
			}
		}

	}

}
