package internship;

import java.util.Scanner;

public class calculatoroperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a,b;
 Scanner sc=new Scanner(System.in);
 
 int choice;
 while(true) {
	 System.out.println("enter ur choice \n1.+\n2.-\n3.*\n4./\n5.%");
	 choice=sc.nextInt();
	 switch(choice) {
	 case 1:
		 System.out.println("Enter a value");
		 a=sc.nextInt();
		 System.out.println("enter another value");
		 b=sc.nextInt();
		 System.out.println( a+b);
		 break;
	 case 2:
		 System.out.println("Enter a value");
		 a=sc.nextInt();
		 System.out.println("enter another value");
		 b=sc.nextInt();
		 System.out.println(a-b);
		 break;
	 case 3:
		 System.out.println("Enter a value");
		 a=sc.nextInt();
		 System.out.println("enter another value");
		 b=sc.nextInt();
		 System.out.println(a*b);
		 break;
	 case 4:
		 System.out.println("Enter a value");
		 a=sc.nextInt();
		 System.out.println("enter another value");
		 b=sc.nextInt();
		 System.out.println(a/b);
		 break;
	 case 5:
		 System.out.println("Enter a value");
		 a=sc.nextInt();
		 System.out.println("enter another value");
		 b=sc.nextInt();
		 System.out.println(a%b);
		 break;
	 case 6:
		 break;
		 default:
			 System.out.println("enter valid choice");
	 }
	 }
	}

}
