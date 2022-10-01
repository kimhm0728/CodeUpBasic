package Basic100;
import java.util.Scanner;

public class Basic_1085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		String s = stdin.nextLine();
		stdin.close();
		String[] arr = s.split(" ");
		double result = 1;
		
		for(int i=0;i<arr.length;i++)
			result *= Integer.parseInt(arr[i]);
		
		result /= (double)8;
		result /= (double)1024;
		result /= (double)1024;
		
		System.out.println(String.format("%.1f", result)+" MB");
	}

}
