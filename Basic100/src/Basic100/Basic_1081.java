package Basic100;
import java.io.*;
import java.util.StringTokenizer;

public class Basic_1081 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		for(int i=1;i<=n;i++)
			for(int j=1;j<=m;j++)
				System.out.println(i+" "+j);
	}

}
