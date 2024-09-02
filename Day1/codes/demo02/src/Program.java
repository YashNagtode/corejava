
public class Program {

	public static void main(String[] args) {
		System.out.println("Hello world");
		Program.main(10, 20);
		Program.main();

	}
	//main with 2 arguments 
	public static void main(int a, int b) {
		System.out.println("Main with 2 arguments");

	}
	//main with no arguments 
	public static void main() {
		System.out.println("main with no arguments");

	}

}
