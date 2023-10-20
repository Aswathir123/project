package Project2;
import java.util.Scanner;
public class Palindrome {
	public void display(String n)
	{
		StringBuilder sb=new StringBuilder(n);
		sb.reverse();
		String word=sb.toString();
		System.out.println( "Reversed name is :"+word);
		if(n.equals(word)){
			System.out.println( "Palindrome");
		}
		else
		{
			System.out.println( "Not a Palindrome");}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word to check Palindrome");
		
		String name=sc.next();
		Palindrome obj=new Palindrome();
		obj.display(name);
	}}
		

