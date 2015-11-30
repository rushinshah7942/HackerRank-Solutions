import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Alternate {

    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	int total = Integer.parseInt(sc.nextLine());
    	int i=0;
    	while(i<total)
    	{
    		i++;
    		String str = sc.nextLine();
    		checkDeletion(str);
    	}
    }
    public static void checkDeletion(String temp)
    {
    	int count=0;
    	int i=0;
    	while(i<temp.length()-1)
    	{
    		if(temp.charAt(i)== temp.charAt(i+1))
    		{
    			count++;
    		}
    		i++;
    	}
    	System.out.println(count);
    }
}
