package collections;

import java.util.ArrayList;

public class Example1 {
	public static void main(String[] args) {
//		ArrayList is a class.
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

//		class has method and we just have to call them

		arrayList.add(12);
		arrayList.add(120);
		arrayList.add(100);
		arrayList.add(56);
//		in Arraylist we can add null
		arrayList.add(null);
//		to add at a particular index
		arrayList.add(0, 90);

		System.out.println(arrayList);
		System.out.println(arrayList.size());
		System.out.println(arrayList.contains(12));

//		To access one by one
		for (Integer i : arrayList) {
			System.out.println(i);
		}

		System.out.println("============================");
//		forEach

		arrayList.forEach((n) -> System.out.println(n));
	}
}

//Collections -It is a framwork which helps to manage  groups of object.  Readymate data structure . It is also a blueprint for list, queue and set.

//List- to store multiple obj together. it is a interface in which we have arrayList, linklist and vectorlist. whose child is Stack. Arraylist is dynamic in nature,it grows and shrink.	Searching is easy in Arraylist as it stores in continuous manner.

//Linkedlist - store obj together,in this we have node which has first as data and second has next like this link has created,head always stores memory address of first element,last will store null as next.Each element  is having address of next element.Searching is not easy as it doesn't store as it points to the next element