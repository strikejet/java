package demo13_08;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Demo13_08Main {
	public static void main(String[] args) {
		//Map<Integer,String> map = new HashMap<>(); // fastest -- random order
		//Map<Integer,String> map = new LinkedHashMap<>(); // slower than hashmap -- order of insertion
		Map<Integer,String> map = new TreeMap<>(); // slower than both above -- natural order of key 
		//Map<Integer,String> map = new Hashtable<>(); // legacy collection (1.0)
		
		map.put(411052, "Hinjewadi Pune"); // returns null
		map.put(411037, "Market Pune"); // returns null
		map.put(411046, "Katraj Pune"); // returns null
		map.put(411001, "Pune Station"); // returns null
		map.put(400027, "Byculla Mumbai"); // returns null
		map.put(400001, "CST Mumbai"); // returns null
		map.put(411007, "XYZ Pune"); // returns null
		map.put(411007, "PQR Pune"); // returns "XYZ Pune" (old value for that key)
		
		System.out.println("Size: " + map.size());
		
		int key = 411006;
		String value = map.get(key);
		System.out.println("\nkey=" + key + " --> value=" + value);
	
		Set<Integer> keys = map.keySet();
		System.out.println("\nAll Keys in map: ");
		System.out.println(keys);
		
		Collection<String> values = map.values();
		System.out.println("\nAll Values in map: ");
		System.out.println(values);
		
		System.out.println("\nAll Entries in map: ");
		Set<Entry<Integer, String>> entries = map.entrySet();
		for (Entry<Integer, String> en : entries)
			System.out.println(en.getKey() + " -- " + en.getValue());
		
		System.out.println("\nAll Entries in map using lambda: ");
		map.forEach((k,v) -> System.out.println(k + " -- " + v));
	}
}











