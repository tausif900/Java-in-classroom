package finalExamples;
// When class is final we cann't inherit  that class and when method is final we cann't override that method.
class P {
	 final void display() {

	}
}

class Q extends P {
	@Override
	void display() {

	}
}

public class Example2 {
	public static void main(String[] args) {
	}
}
