package collections;

import java.util.TreeMap;

public class Example22 {
	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(101, "Fahad");
		treeMap.put(102, "Tausif");
		treeMap.put(103, "Anfal");
		treeMap.put(104, "Ammar");
		treeMap.put(105, "Areen");
		System.out.println(treeMap);

//		All these methods are only applicable on TreeSet.
//		*------------------------------------------------*
		System.out.println(treeMap.lowerKey(103));
		System.out.println(treeMap.lowerEntry(103));

		System.out.println(treeMap.higherKey(104));
		System.out.println(treeMap.higherEntry(104));

		System.out.println(treeMap.ceilingKey(100)); // id haito wahi return krega wrna pass ki gyi value se badi value
														// return krega,if id is not present then null returga
		System.out.println(treeMap.floorKey(1037));

		System.out.println(treeMap.floorEntry(1037));

		System.out.println(treeMap.subMap(101, 104));
		System.out.println(treeMap.subMap(101, false, 104, true));

		treeMap.pollFirstEntry();
		System.out.println(treeMap); // Removes first element.
		treeMap.pollLastEntry(); // Removes last element.
		System.out.println(treeMap);
//		*------------------------------------------------*
		treeMap.remove(103);
		System.out.println(treeMap);

		treeMap.remove(102, "Tausif");
		System.out.println(treeMap);
	}
}
