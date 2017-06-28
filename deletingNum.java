package guvi;
import java.util.Arrays;
import java.util.Scanner;
public class deletingNum {
	public static void main(String[] args) {
			System.out.println("enter the values");      
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			String s="";
			s+=num;
			//System.out.println(s);
			char[]c=s.toCharArray();
			Arrays.sort(c);
			System.out.println(c);
			System.out.println("enter the k");
			Scanner sc1=new Scanner(System.in);
			int k=sc1.nextInt();
			for(int i=0;i<k-1;i++)
		{
				System.out.print(""+c[i]);
		}
			
			
	
		}
		

}
