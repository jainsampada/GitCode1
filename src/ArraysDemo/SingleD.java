package ArraysDemo;

import java.util.Scanner;

public class SingleD {

	int[] rollno=new int[10];
	int counter;
	Scanner s=new Scanner(System.in);
	public void acceptDet()
	{
		System.out.println(rollno.length);
		System.out.println("Enter 5 elements");
		for(counter=0;counter<5;counter++)
		{
			rollno[counter]=s.nextInt();
		}
		//for(int n=0;n<10;n++)
		for(int n:rollno)
		{
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleD oo=new SingleD();
		oo.acceptDet();
	}

}
