package com.practical.lab8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceGender {
	public static void main(String[] args) {
		File f1 = null, f2 = null;
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			f1 = new File("C:\\Users\\Sohan Rane\\eclipse-workspace\\OOPPractical\\src\\sample.txt");
			fr = new FileReader(f1);
			br = new BufferedReader(fr);
			f2 = new File("C:\\Users\\Sohan Rane\\eclipse-workspace\\OOPPractical\\src\\copy.txt");
			fw = new FileWriter(f2);
			bw = new BufferedWriter(fw);
			String line;
			while ((line = br.readLine()) != null) {
				bw.write(line.replace("his", "her"));
				bw.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null) {
					bw.flush();
					bw.close();
				}
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
