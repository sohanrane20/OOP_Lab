package com.practical.lab8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SortNames {
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
			String[] lines = new String[10];
			int count = 0;
			while ((line = br.readLine()) != null && count < 10) {
				StringBuffer sb = new StringBuffer(line);
				sb.delete(0, 3);
				lines[count++] = new String(sb);
			}
			for (int i = 0; i <= lines.length - 2; i++) {
				for (int j = i + 1; j <= lines.length - 1; j++) {
					if (lines[i] != null && lines[j] != null && lines[i].compareTo(lines[j]) == 1) {
						String text = lines[i];
						lines[i] = lines[j];
						lines[j] = text;
					}
				}
			}
			for (int i = 0; i < lines.length; i++) {
				if (lines[i] != null)
					bw.write(lines[i]);
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
