package Basic100;
import java.util.Scanner;

public class Basic_1067 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int i = stdin.nextInt();
		stdin.close();
		
		if(i>0)
			System.out.println("plus");
		else
			System.out.println("minus");
		
		if(i%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
	}

}
