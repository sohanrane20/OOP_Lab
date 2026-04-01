package com.practical.lab5;
import java.util.Scanner;
enum Status
{
	CORRECT,
	WRONG,
	UNANSWERED
}
abstract class QuizResult
{
	protected char[] correctAnswers = {'C', 'A', 'B', 'D', 'B', 'C', 'C', 'A'};
	protected char[] submittedAnswers = new char[8]; 
	protected Status[] result = new Status[8];
	public final int PASS_MARKS = 5;
	QuizResult(char[] submittedAnswers)
	{
		this.submittedAnswers = submittedAnswers;
	}
	abstract void checkAnswers();
}
class Report extends QuizResult
{
	private int correct = 0, wrong = 0;
	Report(char[] submittedAnswers)
	{
		super(submittedAnswers);
	}
	void checkAnswers()
	{
		for (int i = 0; i < 8; i++)
		{
			if (submittedAnswers[i] == 'X')
			{
				result[i] = Status.UNANSWERED;
			}
			else if (submittedAnswers[i] == correctAnswers[i])
			{
				result[i] = Status.CORRECT;
				correct++;
			}
			else
			{
				result[i] = Status.WRONG;
				wrong++;
			}
		}
	}
	boolean hasPassed()
	{
		return correct >= PASS_MARKS;
	}
	void printReport()
	{
		System.out.println("---------------------------------------------------------------");
		System.out.println("| Question | Submitted answers | Correct answers | Result     |");
		System.out.println("---------------------------------------------------------------");
		for (int i = 0; i < 8; i++)
		{
			System.out.printf("| %8d | %17c | %15c | %10s |\n", (i + 1), submittedAnswers[i], correctAnswers[i], result[i]);
			System.out.println("---------------------------------------------------------------");
		}
		System.out.println("Number of correct answers is " + correct);
		System.out.println("Number of wrong answers is " + wrong);
		if (hasPassed())
		{
			System.out.println("The candidate passed");
		}
		else
		{
			System.out.println("The candidate failed");
		}
	}
}
public class Quiz 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		char[] submittedAnswers = new char[8];
		for (int i = 0; i < 8; i++)
		{
			do
			{
				System.out.print("Enter answer for question " + (i + 1) + ": ");
				submittedAnswers[i] = input.nextLine().toUpperCase().charAt(0);
			} while (!(submittedAnswers[i] >= 'A' && submittedAnswers[i] <= 'D' || submittedAnswers[i] == 'X'));
			 
		}
		Report report = new Report(submittedAnswers);
		report.checkAnswers();
		report.printReport();
		input.close();
	}
}
