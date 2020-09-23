package com.hsbc.tr.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String, String> stateCap = new TreeMap<>();
		stateCap.put("AP", "Amravati");
		stateCap.put("TS", "Hyderabad");
		stateCap.put("TN", "Chennai");
		stateCap.put("MP", "Bhopal");
		stateCap.put("RJ", "Jaipur");
		stateCap.put("JH", "Ranchi");
		stateCap.put("UP", "Lucknow");

		System.out.println(stateCap);

		System.out.println(stateCap.get("JH"));

		Set<String> keySet = stateCap.keySet();
		Iterator<String> itr = keySet.iterator();

		while (itr.hasNext()) {
			String key = itr.next();
			System.out.println(key + "------>" + stateCap.get(key));
		}

		System.out.println("----------------------------------------------------");

		Collection<String> values = stateCap.values();
		for (String s : values) {
			System.out.println(s);
		}

	}

}
