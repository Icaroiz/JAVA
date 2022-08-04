package Aplication;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] lines = new String [] { "Good M", "Good A" , "Good N"};   	
		String path = "c:\\temp\\icaro.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
