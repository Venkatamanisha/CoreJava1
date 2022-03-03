package internship;



import java.util.*;
 
 public class fibonacciseriesint
{
 public static void main(String args[])
 {
         int i,c=0,n;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter no of series");
     n=sc.nextInt();
   int a=0;
   int b=1;
 
 System.out.println("Fibonacci series upto "+n+" is :-");
   while(c<=n)
   {
       System.out.print(c+" ");
       a=b;
       b=c;
       c=a+b;
   }
 }
}