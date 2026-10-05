import java.util.*;
public class Profit_or_loss {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter cost price:");
	    float cost = sc.nextFloat(); 
	    
	    System.out.println("Enter selling price:");
	    float selling = sc.nextFloat();
	    
	    float price = selling-cost;
	    if(selling < cost)
	    {
	    	System.out.println("loss is rs."+price);
	    }
	    else
	    {
	    	System.out.println("profit is rs."+price);
	    }
	    sc.close();
	    }
	
}
