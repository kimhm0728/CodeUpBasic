package Basic100;
import java.io.*;

public class Basic_1027 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String[] arr = s.split("\\.");
		
		System.out.println(arr[2]+"-"+arr[1]+"-"+arr[0]);
	}

}
