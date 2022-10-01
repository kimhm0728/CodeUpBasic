package Basic100;
import java.util.Scanner;

public class Basic_1069 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		char c = stdin.next().charAt(0);
		stdin.close();
		String str;
		
		switch(c) {
		case 'A':
			str = "best!!!";
			break;
		case 'B':
			str = "good!!";
			break;
		case 'C':
			str = "run!";
			break;
		case 'D':
			str = "slowly~";
			break;
		default:
			str = "what?";
		}
		
		System.out.println(str);
	}

}
