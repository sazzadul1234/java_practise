package Method_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class OOP_main {

	public static void main(String[] args) {
		
		
		
		 Scanner myObj = new Scanner(System.in);
		 System.out.println("Enter name ,gender and age");
		 System.out.println();
		 String nm= myObj.next();
		 String gn= myObj.next();
		 int ag=myObj.nextInt();
		
		 	
		OOP_method person = new OOP_method();
		person.display(nm, gn, ag);
		
		PracticeReturn pr = new PracticeReturn();
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Lamborgini");
		cars.add("farrae");
		cars.add("Prado");
		cars.add("pajero");
		int b =cars.size();
		 System.out.println("Please Enter car price ");
		 System.out.println();
		 int a = myObj.nextInt();
		
		System.out.println( pr.AboutCar(a, b));
		
		System.out.println(cars);
	}

}
