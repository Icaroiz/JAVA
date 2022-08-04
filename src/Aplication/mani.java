package Aplication;

import java.io.File;
import java.util.Scanner;

public class mani {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um caminho: ");
		String strPath =sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("PASTAS: ");
		for (File folder : folders) {
			System.out.println(folder);
		}
		System.out.println();
		File[] files = path.listFiles(File::isFile);
		System.out.println("ARQUIVOS: ");
		for (File file : files) {
			System.out.println(file);
		}
		System.out.println();
		
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Criado com sucesso " + success);
		
		
		
		
		sc.close();
	}
}
