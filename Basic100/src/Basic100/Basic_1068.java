package Basic100;
import java.util.Scanner;

public class Basic_1068 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int i = stdin.nextInt();
		stdin.close();
		char c;

		if(i>=90)
			c = 'A';
		else if(i>=70)
			c = 'B';
		else if(i>=40)
			c = 'C';
		else
			c = 'D';
		
		System.out.println(c);
	}

}
