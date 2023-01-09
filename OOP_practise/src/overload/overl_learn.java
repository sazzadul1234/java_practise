package overload;

import java.util.Random;

public class overl_learn {
	String name,gender;
	int age;
	

	overl_learn()
	{
		System.out.println("The Random Value is \n");
		
	}
	overl_learn(String n,String g,int a)
	{
		name=n;
		gender=g;
		age=a;
	}
	
	void display()
	{
		System.out.println("Name :" +name);
		System.out.println("Gender :" +gender);
		System.out.println("Age :" +age);
	}
	String random()
	{
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ452132564798536354";

	    StringBuilder sb = new StringBuilder();

	    Random random = new Random();

	    int length = 10;

	    for(int i = 0; i < length; i++) {

	      int index = random.nextInt(alphabet.length());

	      char randomChar = alphabet.charAt(index);

	      sb.append(randomChar);
	    }

	    String randomString = sb.toString();
	   
		return randomString;
	}
	

}
