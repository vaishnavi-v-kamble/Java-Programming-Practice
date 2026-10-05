import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
		System.out.println("Enter 1st word:");
	    String str1 = sc.nextLine(); 
	    System.out.println("Enter 2nd word:");
	    String str2 = sc.nextLine(); 

	    char a[] = str1.toLowerCase().toCharArray();
	    char b[] = str2.toLowerCase().toCharArray();
	    
	    Arrays.sort(a);
	    Arrays.sort(b);
	    
	    if(Arrays.equals(a, b))
	    {
	    	System.out.println("Anagram");
	    }
	    else
	    {
	    	System.out.println("Not anagram");
	    }
	    sc.close();
	}

}
