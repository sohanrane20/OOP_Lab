package com.practical.lab4;

import java.util.Scanner;

class Password {
	String password;

	boolean hasLowercaseCharacterAndDigit() {
		boolean hasLowercaseCharacter = false, hasDigit = false;
		for (int i = 0; i < password.length(); i++) {
			if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
				hasLowercaseCharacter = true;
			} else if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
				hasDigit = true;
			}
		}
		return hasLowercaseCharacter && hasDigit;
	}

	boolean hasUppercaseCharacterOrSpecialCharacter() {
		boolean hasUppercaseCharacter = false, hasSpecialCharacter = false;
		for (int i = 0; i < password.length(); i++) {
			if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
				hasUppercaseCharacter = true;
			} else if (!(password.charAt(i) >= 'a' && password.charAt(i) <= 'z')
					&& !(password.charAt(i) >= '0' && password.charAt(i) <= '9')) {
				hasSpecialCharacter = true;
			}
		}
		return hasUppercaseCharacter || hasSpecialCharacter;
	}

	boolean hasRequiredLength() {
		return password.length() >= 5 && password.length() <= 12;
	}

	boolean hasImmediatePattern() {
		for (int i = 0; i < password.length(); i++) {
			for (int j = i + 1; j < password.length(); j++) {

				String pattern = password.substring(i, j);
				if (password.substring(j).startsWith(pattern)) {
					return true;
				}
				/*
				 * int k; for (k = 0; k < pattern.length() && j + k < password.length(); k++) {
				 * if (password.charAt(j + k) != pattern.charAt(k)) { break; } } if (k ==
				 * pattern.length()) { return true; }
				 */
			}
		}
		return false;
	}
}

public class CheckPassword {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Password checkPassword = new Password();
		System.out.print("Enter password: ");
		checkPassword.password = input.next();
		if (checkPassword.hasLowercaseCharacterAndDigit() && !checkPassword.hasUppercaseCharacterOrSpecialCharacter()
				&& checkPassword.hasRequiredLength() && !checkPassword.hasImmediatePattern()) {
			System.out.println("The password is acceptable");
		} else {
			System.out.println("The password is not acceptable");
		}
		input.close();
	}
}