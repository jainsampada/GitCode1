package LoopsDemo;

import java.util.Scanner;

public class WhileDemo {
	int i = 101;
char choice;
Scanner sc=new Scanner(System.in);
	public void acc() {
		do
	 {
			System.out.println("Hello" + i);
			i = i + 10;
			System.out.println("Enter ur choice");
			choice=sc.next().charAt(0);

		}	while (choice=='y');
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhileDemo oo = new WhileDemo();
		oo.acc();
	}

}
