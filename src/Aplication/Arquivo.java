package Aplication;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Arquivo {

	public static void main(String[] args) {

		File file = new File("c:\\temp\\icaro.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);		
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e) {
			System.out.println("ERROR :"+ e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
		}
	}
}
