package project1;
import java.util.*;
public class DataTransfer {
	public static void receive(String cipher, String pass)
	{
		String decrdata="",conpass;
		int n=1;
		Scanner s=new Scanner(System.in);
		System.out.println(" ");
		System.out.println("To view the message ..");
		System.out.println("Enter the key ...");
		conpass=s.nextLine();
		while (!conpass.equals(pass))
		{
			System.out.println("Invalid Key !!!");
			System.out.print("Please Enter Key Again : ");
			conpass=s.nextLine();
		}
		System.out.println("Sucessfully Entered ...");
		for(int i=4;i<cipher.length();i++)
		{
			decrdata +=(char)(cipher.charAt(i)-n);
			n++;
		}
		System.out.println("Your Message is : "+ decrdata);
	}
	
	public static void main(String[] args) {
		String data,key,endata = "";
		int num=1;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Message : ");
		data=sc.nextLine();
		for(int i=0;i<data.length();i++)
		{
			endata+=(char)(data.charAt(i)+num);
			num++;
		}
		System.out.println("Data is in Cipher Text format ..."+ "("+ endata +")  ");
		System.out.print(" Set a key (atleast 8 characters ) : ");
		key=sc.nextLine();
		while (key.length()<8)
		{
			System.out.println("Unsafe key ");
			System.out.println("!!!! NEVER USE A DICTIONARY WORD AS KEY !!!");
			key=sc.nextLine();
		}
		System.out.println("Message sent Sucessfully :-) ");
		receive(endata,key);
	}
}
