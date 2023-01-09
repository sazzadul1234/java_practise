package Learn_class;

public class Constructor_Learn {

	   String name ;
	   int age;
	public Constructor_Learn(String s, int a) {
		//System.out.println(s + "Age is " +a);
		name=s;
		age=a;
	}
	
	public static void main(String[] args) {
		
		
		Constructor_Learn cl = new Constructor_Learn("Sohag", 30);
		
		String st="messi",st2="male";
		int in = 32;
		System.out.println("Name is : " + cl.name);
		System.out.println("Age is " + cl.age);
		OOP op = new OOP (st ,st2 ,in);
		op.display();
	
	}

}
