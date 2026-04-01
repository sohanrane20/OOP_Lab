package com.practical.lab8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class FindOccurence {
	String line;
	int beg = -1, end = -1;

	void readFile() {

	}

	void findPosition(String text) {
		for (int i = 0; line != null && i < line.length(); i++) {
			int j;
			for (j = 0; j < text.length() && i + j < line.length(); j++) {
				if (Character.toUpperCase(line.charAt(i + j)) != Character.toUpperCase(text.charAt(j)))
					break;
			}
			if (j == text.length()) {
				if (beg == -1)
					beg = i;
				end = i;
			}
		}
	}

	String copySubstring(String text) {
		readFile();
		findPosition(text);
		if (beg != -1)
			return line.substring(beg + text.length(), end);
		else
			return null;
	}
}

public class OccurencePosition {
	public void main(String[] args) {
		File f1 = null;
		FileReader fr = null;
		BufferedReader br = null;
		try {
			f1 = new File("C:\\Users\\Sohan Rane\\eclipse-workspace\\OOPPractical\\src\\sample.txt");
			fr = new FileReader(f1);
			br = new BufferedReader(fr);
			String line = br.readLine();
			String search = "the";
			int start = line.indexOf(search);
			int end = start + search.length() - 1;
			System.out.println("Start=" + start);
			System.out.println("End=" + end);
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
