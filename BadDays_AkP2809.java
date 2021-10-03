import java.util.*;

public class BadDays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] visit=new int[n];
		
		for(int i=0;i<n;i++)
			visit[i]=sc.nextInt();
		
		int bad_days=0;
		for(int i=2;i<n;i++)
		{
			if( (visit[i-2]+visit[i-1])>=(visit[i]) && (visit[i-2]<visit[i-1]) )
				bad_days++;
		}
		System.out.println(bad_days);
		
		sc.close();

	}

}
