import java.util.Scanner;

class takingInput {
	public static void main(String[] args) {
		int length;
		// int height;
		int width;
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the length?");
		length = scan.nextInt();
		// System.out.println("What is the height?");
		// height = scan.nextInt();
		System.out.println("What is the width?");
		width = scan.nextInt();
		int area = length * width;
		int perimeter = length + width;
		System.out.println("The Area is: " + area + "\nThe Perimeter is: " + perimeter);
	}
}