package guvi;
import java.util.Scanner;
public class sumPalindrome {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the Numbers:");
		int input=sc.nextInt();
		sc.close();
		int t=input;
while(input>0){
	int a=input%10;
	input=input/10;
	int b=input%10;
	input=input/10;
	int c=a+b+input;
	}
if(t==input){
	System.out.println("Palindrome");
}
else{
	System.out.println("Not a Palindrome");
}
	}

}
