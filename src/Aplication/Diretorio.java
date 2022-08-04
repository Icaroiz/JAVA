package Aplication;

import java.io.File;
import java.util.Scanner;

public class Diretorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Caminho do arquivo: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("Nome : " + path.getName());
		System.out.println("Caminho: " + path.getParent());
		System.out.println("Caminho total" + path.getParent());
		
		
		
		sc.close();
	}

}
