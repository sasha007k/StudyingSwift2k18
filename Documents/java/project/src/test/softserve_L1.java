package test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class softserve_L1 
{
    public static void main(String[ ] args) throws IOException  
    {    	
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		//1
    		System.out.println("Radius is  ");
	    double radius = Double.parseDouble(br.readLine());
	    double area = Math.PI * radius * radius;
	    System.out.println(area);
	    double perumetr = 2 * Math.PI * radius;
	    System.out.println(perumetr);
    	
    		//2
//	    System.out.println("What is ur name?");
//	    String name = br.readLine();
//	    System.out.println("Where do u live, " + name + "?");
//	    String city = br.readLine();
//	    System.out.println("Your name is " + name + ". You live in " + city);
    		
    	
    		//3
//	    System.out.println("What price per minute for C1?");
//	    double c1 = Double.parseDouble(br.readLine());
//	    System.out.println("How many time does it last?");
//	    double t1 = Double.parseDouble(br.readLine());
//	    System.out.println("Total price is ");
//	    double price1 = c1 * t1;
//	    System.out.println(price1);
//	    
//	    System.out.println("What price per minute for C2?");
//	    double c2 = Double.parseDouble(br.readLine());
//	    System.out.println("How many time does it last?");
//	    double t2 = Double.parseDouble(br.readLine());
//	    System.out.println("Total price is ");
//	    double price2 = c2 * t2;
//	    System.out.println(price2);
//	    
//	    System.out.println("What price per minute for C3?");
//	    double c3 = Double.parseDouble(br.readLine());
//	    System.out.println("How many time does it last?");
//	    double t3 = Double.parseDouble(br.readLine());
//	    System.out.println("Total price is ");
//	    double price3 = c3 * t3;
//	    System.out.println(price3);
//	    
//	    System.out.println("3 calls together is ");
//	    double together = price1 + price2 + price3;
//	    System.out.println(together);
	    
    	
    	
    	
	    
    }
}

