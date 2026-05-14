package generics;

import encapsulation.Employee;

//	T is type , R is return Type
interface I1<T, R> {
	R showDetails(T obj);
}

class P implements I1<Employee, Integer> {

	@Override
	public Integer showDetails(Employee obj) {
		return obj.getSalary() + 5000;
	}

}

public class Example3 {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setSalary(50000);
		System.out.println(new P().showDetails(e1));
	}
}
