package Basic100;
import java.util.Scanner;

public class Basic_1046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		String s = stdin.nextLine();
		stdin.close();
		String[] arr = s.split(" ");
		int sum = 0;
		
		for(int i=0;i<3;i++) 
			sum += Integer.parseInt(arr[i]);
		
		System.out.println(sum);
		System.out.println(String.format("%.1f", (double)sum/3));
	}

}
