package internship;

import java.util.Scanner;

public class factorialprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n;
int fact=1;
System.out.println("Enter number");
n=sc.nextInt();
for(int i=1;i<=n;i++){    
    fact=fact*i;    
}   
System.out.println(fact);

	}

}
