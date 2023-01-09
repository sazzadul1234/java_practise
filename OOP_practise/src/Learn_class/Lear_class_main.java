package Learn_class;

import java.util.Scanner;

public class Lear_class_main {

	public static void main(String[] args) {
		//OOP info=new OOP();
		System.out.println("Hellow");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input Name");
		String st1=keyboard.next();
		System.out.println("Input Gender");
		String st2=keyboard.next();
		System.out.println("Input age");
		int intage = keyboard.nextInt();
		OOP info=new OOP(st1,st2,intage);
	   //info.set_info(st1,st2,intage);
	   info.display();
		
		
		//OOP info1=new OOP();
		
		Scanner keyboard2 = new Scanner(System.in);
		System.out.println("Input Name");
		String st3=keyboard.next();
		System.out.println("Input Gender");
		String st4=keyboard2.next();
		System.out.println("Input age fd");
		int intage2 = keyboard2.nextInt();
	
		OOP info1=new OOP(st3,st4,intage2);
		//info1.set_info(st3,st4,intage2);
		info1.display();

		
		
	}
	
	
	
	

}
