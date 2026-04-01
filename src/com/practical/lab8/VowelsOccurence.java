package com.practical.lab8;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class VowelsOccurence {
	public static void main(String[] args) {
		File f1 = null;
		FileReader fr = null;
		try {
			f1 = new File("C:\\Users\\Sohan Rane\\eclipse-workspace\\OOPPractical\\src\\sample.txt");
			fr = new FileReader(f1);
			char chr;
			while ((chr = (char) fr.read()) != -1) {
				switch (Character.toUpperCase(chr)) {
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
					System.out.print(chr);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
