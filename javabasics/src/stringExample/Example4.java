package stringExample;

public class Example4 {
	public static void main(String[] args) {
		String filename = "index.html";
		System.out.println("File is " + filename.substring(0, filename.indexOf(".")));
		System.out.println("Extension is " + filename.substring(filename.indexOf(".")));

		String filename1[] = { "nature.jpg", "untitled.jpeg" };
		for (String s : filename1) {
			System.out.println(s.substring(0, s.indexOf(".")));
			System.out.println(s.substring(s.indexOf(".")));
		}

	}
}
