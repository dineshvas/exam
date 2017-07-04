package guvi;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayIndex {
	public static void main(String arr[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array_size:");
		int s=sc.nextInt();
		int a[]=new int[s];
		for(int i=0;i<s;i++){
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int count=0;
		for(int i=0;i<s-1;i++){
			if(a[i]==a[i+1]){
				count++;
				}if(count==0){
				System.out.println("Enter the Index:");	
				int k=sc.nextInt();
				if(k<s){
				System.out.println("The Element in given Index:"+k+" is "+a[k]);
				}else{
					System.out.println("Enter correct Index");
				}}
		else{
					System.out.println("Enter the valuable index::The Array are not unique");
				}
				}

	}

}
