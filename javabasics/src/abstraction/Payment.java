package abstraction;

public interface Payment {
	void pay();

	default void demo() {
//		default methods with implementation is allowed
	}

	private void demo1() {
//		private with implementation is allowed
	}
}

//	Interface is also a blueprint for other classes. It is the advance version of Abstraction.
//	if we want to inherit interface class we use implements keyword.
//	By default all methods  in interface is public abstract method.
//	object cannn't created directly. but using Anonymous inner type
//	when we inherit inteface class, we have to override the methods of interface class in the child class.
// 	parent has the capability to holds child ka object.
// 	In interface default method with implementation is allowed.
// 	protected method with implementation is not allowed.
// 	private with implementation is allowed
