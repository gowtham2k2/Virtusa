
import java.util.*;
public class Revword
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    String word[]=str.split(" ");
	    String rev="";
	    for(String w:word)
	    {
	        StringBuilder sb=new StringBuilder(w);
	        sb.reverse();
	        rev=rev+sb.toString()+" ";
	    }System.out.println(rev);
	}
}
