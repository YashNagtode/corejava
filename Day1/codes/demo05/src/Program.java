import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Input rollno , name and marks and display it 
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter rollno : "); 
		int roll = sc.nextInt(); // 7 + \n 
		System.out.print("Enter name : ");
		sc.nextLine(); 
		String name = sc.nextLine();
		System.out.print("Enter marks : ");
		double marks = sc.nextDouble(); 
		
		System.out.println("rollno : "+roll);
		System.out.println("Name : "+name);
		System.out.println("Marks : "+marks);

	}

}
