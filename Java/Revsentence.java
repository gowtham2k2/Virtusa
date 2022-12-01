import java.util.*;
public class Revsentence
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String lett[]=str.split(" ");
		String ns="";
		for(int i=lett.length-1; i>=0; i--)
		{   StringBuilder sb=new StringBuilder(lett[i]);
		    ns=ns+sb+" ";
		}
		System.out.println(ns);
	}
}
