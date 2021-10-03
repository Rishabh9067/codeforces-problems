import java.util.*;

public class BeautifulYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int year=sc.nextInt();
		
		int i=year+1,temp,a,b,c,d;
		while(true)
		{
			temp=i;
			
			a=(temp%10);
			temp/=10;
			b=(temp%10);
			temp/=10;
			c=(temp%10);
			temp/=10;
			d=(temp%10);
			
			if( (a!=b) && (a!=c) && (a!=d) && (b!=c) && (b!=d) && (c!=d))
			{
				System.out.println(i);
				break;
			}
			else
				i++;
		}
		sc.close();
	}

}
