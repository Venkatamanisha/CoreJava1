package internship;

import java.util.ArrayList;

public class Arraylistint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("mani");
		obj.add("nityaa");
		obj.add("nandhu");
		System.out.println(obj);
		obj.add(0,"Rahul");
		obj.remove("nandhu");
		for(String s:obj) {
			System.out.println(s);
		}

			}

	}





