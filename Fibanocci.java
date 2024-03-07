import java.util.Scanner;
public class Fibanocci {
public static void main(String [] args)
{
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter the limit for Fibanacci series:");
	int num=sc.nextInt();
	int firstNum=0,secondNum=1;
	int nextNum=0;
	System.out.print("Fibonacci Series upto"+num+":");
	while(num>nextNum)
		
	{
	   
		nextNum=firstNum+secondNum;
		firstNum=secondNum;
		secondNum=nextNum;
		System.out.print(firstNum+",");
	}
	
}
}
