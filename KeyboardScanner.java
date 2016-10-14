import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {
		int integer;
		float float_point_number;
		String name;
		Scanner scanf=new Scanner(System.in);
		System.out.printf("Enter a integer: ");
		integer=scanf.nextInt();
		System.out.printf("Enter a float point number:");
		float_point_number=scanf.nextFloat();
		System.out.printf("Enter a you name:");
		name=scanf.next();
		System.out.printf("Hi %s, the multiplication of %d and %.5f is %.2e ", name , integer , float_point_number , integer*float_point_number );
		scanf.close();
	}

}
