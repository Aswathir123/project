package project1;
import java.util.Scanner;
public class Numbers {
	public void display(int n)
	{
	int i=1;
		System.out.println("Numbers are.. ");
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}			
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		 int number=sc.nextInt();
		Numbers obj=new Numbers();
		obj.display(number);
		System.out.println("Done");
	}
	
}
