
import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		String a,b;
		int flag;
		Scanner scanf=new Scanner(System.in);
		do{
			System.out.printf("Enter a  string 1: ");
			a=scanf.next();
			System.out.printf("Enter a  string 2: ");
			b=scanf.next();
			flag=a.compareToIgnoreCase(b);		
			if(flag!=0)
				System.out.println("The two strings are not the same.");
			}while(flag!=0);
		
		System.out.printf("The two strings are the same.");
		

	}

}
