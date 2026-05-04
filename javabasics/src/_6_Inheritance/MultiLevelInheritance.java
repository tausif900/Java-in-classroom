package _6_Inheritance;

public class MultiLevelInheritance {
	
//	MultilevelInheritance	- P->Q->R->S,here S is inheriting R And R is inheriting Q And Q is inheriting P, hence it's called Multilevel Inheritance.So here S will get all the properties of it's Parent Classes.
	
	public static void main(String[] args) {
		S obj = new S();
		obj.methodP();
		obj.methodQ();
		obj.methodR();
		obj.methodS();
	}
}


//	Hierarchical Inheritance- Parent class have multiple children. Siblings will not share any properties 