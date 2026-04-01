package com.practical.casebased;

import java.util.Random;

class Probability {
	public static final int THROWS = 1000000;

	int simulateProcess() {
		int count = 0;
		Random random = new Random();
		for (int i = 1; i <= THROWS; i++) {
			double x = random.nextDouble() * 2 - 1;
			double y = random.nextDouble() * 2 - 1;
			if (isOddNumberedRegion(x, y)) {
				count++;
			}
		}
		return count;
	}

	double findProbability() {
		int favourable = simulateProcess();
		return ((double) favourable) / THROWS;
	}

	boolean isOddNumberedRegion(double x, double y) {
		if (x < 0 || (x > 0 && y > 0 && x + y < 1)) {
			return true;
		} else {
			return false;
		}
	}
}

public class MonteCarloSimulation {
	public static void main(String[] args) {
		Probability probable = new Probability();
		System.out
				.println("Probability for a dart to fall into an odd numbered region = " + probable.findProbability());
	}
}
