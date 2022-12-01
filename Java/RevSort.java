/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class RevSort{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    StringBuilder rev=new StringBuilder(str);
	    rev.reverse();
	     str=rev.toString();
	    String word[]=str.split(" ");
	    ArrayList<String> rw=new ArrayList<String>();
	    for(int i=0; i<word.length; i++)
	    {
	        rw.add(word[i]);
	    }
	    String tr="";
	    Collections.sort(rw);
	    for(int i=0; i<rw.size(); i++){
	        StringBuilder sb=new StringBuilder(rw.get(i));
	        tr=tr+sb+" ";
	        
	    }
	   System.out.println(tr);
	    
	    
	}
}
