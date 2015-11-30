import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Morgan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        
        int i=0;
        while(i<num)
        {
        	String str1 = sc.nextLine();
        	String str2 = sc.nextLine();
        	lexMin(str1,str2);
        	i++;
        }
    }
    public static void lexMin(String str1, String str2)
    {
    	String result = "";
    	int ptr1=0;
    	int ptr2 =0;
    	
    	while(ptr1<str1.length() && ptr2<str2.length())
    	{
    		//System.out.println("Before: "+ ptr1 + " " + ptr2);
    		if(str1.charAt(ptr1)<=str2.charAt(ptr2))
    		{
    			result = result + str1.charAt(ptr1);
    				ptr1++;
    		}
    		else
    		{
    			result = result + str2.charAt(ptr2);
    			ptr2++;
    		}
    		//System.out.println("After: "+ ptr1 + " " + ptr2);
    	}
    	//System.out.println("After Execution: "+ ptr1 + " " + ptr2);
    	if(ptr1<str1.length())
    	{
    		while(ptr1<str1.length())
    		{
    			result = result + str1.charAt(ptr1);
				ptr1++;
    		}
    	}
    	if(ptr2<str2.length())
    	{
    		while(ptr2<str2.length())
    		{
    			result = result + str2.charAt(ptr2);
				ptr2++;
    		}
    	}
    	System.out.println("result:"+ result);
    } 
}	
