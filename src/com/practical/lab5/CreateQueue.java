package com.practical.lab5;

import java.util.Scanner;

class QueueOverflowException extends Exception {
	QueueOverflowException(String message) {
		super(message);
	}
}

class QueueUnderflowException extends Exception {
	QueueUnderflowException(String message) {
		super(message);
	}
}

interface QueueImplementation {
	void insertElement(int element);

	int deleteElement();

	void displayQueue();
}

class QueueDemo implements QueueImplementation {
	final static int SIZE = 10;
	int[] queue = new int[SIZE];
	int front = -1, rear = -1;

	public void insertElement(int element) {
		if (rear == SIZE - 1) {
			try {
				throw new QueueOverflowException("Queue full");
			} catch (QueueOverflowException ex) {
				ex.printStackTrace();
			}
		}
		if (front == -1) {
			front++;
		}
		queue[++rear] = element;
	}

	public int deleteElement() {
		if (front == -1) {
			try {
				throw new QueueUnderflowException("Queue empty");
			} catch (QueueUnderflowException ex) {
				ex.printStackTrace();
			}
		}
		return queue[front++];
	}

	public void displayQueue() {
		for (int i = front; i <= rear; i++) {
			System.out.print(queue[i] + "\t");
		}
	}
}

public class CreateQueue {
	public static void main(String[] args) {
		int choice, element;
		Scanner input = new Scanner(System.in);
		QueueDemo createQueue = new QueueDemo();
		do {
			System.out.println("1: Insert element");
			System.out.println("2: Delete element");
			System.out.println("3: Display queue");
			System.out.print("Enter choice: ");
			choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter element: ");
				element = input.nextInt();
				createQueue.insertElement(element);
				break;
			case 2:
				element = createQueue.deleteElement();
				System.out.println("Deleted element = " + element);
				break;
			case 3:
				System.out.print("Elements of queue are ");
				createQueue.displayQueue();
				System.out.print("\n");
				break;
			default:
				System.out.println("Invalid choice");
			}
		} while (choice >= 1 && choice <= 3);
		input.close();
	}
}
