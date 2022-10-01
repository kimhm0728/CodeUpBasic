package Basic100;
import java.util.Scanner;

public class Basic_1076 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		char input = stdin.next().charAt(0);
		stdin.close();
		char c = 'a';
		
		do {
			System.out.print(c++ +" ");
		} while(c<=input);
		
	}

}
