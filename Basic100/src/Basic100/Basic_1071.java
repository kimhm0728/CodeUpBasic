package Basic100;
import java.util.Scanner;

public class Basic_1071 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		String s = stdin.nextLine();
		stdin.close();
		String[] arr = s.split(" ");
		
		for(int i=0;i<arr.length;i++)
			if(arr[i].equals("0"))
				break;
			else
				System.out.println(arr[i]);
	}

}
