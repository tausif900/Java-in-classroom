package collections;

import java.util.Vector;

public class Example6 {
	public static void main(String[] args) {
//	VectorList is nothing but a old list which is drag to collection.It is also having Array like structure,bbut when we add elements in vector it's capacity gets double.memory and storage wise it's not dynamic.It is thread safe i.e. Multiple task cann't be performed in vector.Elements store in a continous manner.
		Vector<Integer> vector = new Vector<Integer>();
		for (int i = 0; i <= 41; i++) {
			vector.add(i);
		}
		System.out.println(vector.capacity()); 	//80
	}
}
