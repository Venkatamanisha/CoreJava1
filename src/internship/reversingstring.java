package internship;

import java.util.Scanner;

public class reversingstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String dem=sc.next();
		StringBuffer courses=new StringBuffer(dem);
		courses.reverse();
		System.out.println(courses);
	}

}
