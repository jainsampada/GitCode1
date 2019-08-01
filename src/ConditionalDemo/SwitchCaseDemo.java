package ConditionalDemo;

import java.util.Scanner;

public class SwitchCaseDemo {
	int num1,num2,res,choice;
	Scanner sc=new Scanner(System.in);
public void enter()
{
	System.out.println("Enter value for Num1");
	num1=sc.nextInt();
	
	System.out.println("Enter value for Num2");
	num2=sc.nextInt();
	
	
	
}
public void check()
{
	System.out.println("1.Add\t\t2.Subtract\n3.Multiply\t4.Divide");
	System.out.println("Enter your Choice");
	choice=sc.nextInt();
	
	switch(choice)
	{
	case 1:
		enter();
		res=num1+num2;
		System.out.println("Result of Addition is:"+res);
		break;
		
	case 2:
		enter();
		res=num1-num2;
		System.out.println("Result of Subtraction is:"+res);
		break;
		
	case 3:
		enter();
		res=num1*num2;
		System.out.println("Result of Multiplication is:"+res);
		break;
		
	case 4:
		enter();
		res=num1/num2;
		System.out.println("Result of Division is:"+res);
		break;
		
		default:
			System.out.println("Sorry u have entered the wrong choice");
			break;
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwitchCaseDemo oo=new SwitchCaseDemo();
		oo.check();
	}

}
