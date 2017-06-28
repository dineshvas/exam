package guvi;
import java.util.Scanner;
public class amountDetect {
  public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enetr Amount:");
	  int amt=sc.nextInt();
	  while(amt>=500){
		 int p=amt/500;
		  amt=amt%500;
	  	  System.out.println("500 notes: "+p);
	  break;	  
	  }
	  while(amt>=100){
		  int q=amt/100;
		  amt=amt%100;
		  System.out.println("100 notes:"+q);
	  break;
	  }
	  while(amt>=50){
		  int r=amt/50;
		  amt=amt%50;
		  System.out.println("50 notes:"+r);
		  break;
	  }
while(amt>=10){
	int s=amt/(3*10);
	amt=amt%(3*10);
	System.out.println("10 notes:"+s);
	break;
}
while(amt>=1){
	int t=amt/(9*1);
	amt=amt%(9*1);
	System.out.println("1 notes:"+t);
	break;
}
    }
}
