package Learn_class;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Text {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Hi");
		File text = new File("C:/AutomationConfigStgBhutan/ID/new-app-id-file.txt");
        Scanner e_id = new Scanner(text);
        System.out.println(e_id.nextLine());
	}

}
