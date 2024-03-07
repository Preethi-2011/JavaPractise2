import java.util.Scanner;
public class Factorial {
public static void main(String[] args)
{
int fact=1;
int i;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number:");
int a=sc.nextInt();
for(i=1;i<=a;i++)
{
fact=fact*i;	
}
System.out.println("The Factorial of 4 is:" +fact);
}
}
