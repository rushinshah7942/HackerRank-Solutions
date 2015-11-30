import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Funny {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int count = 0;
        while(count<n)
        {
        	count++;
        	String temp = sc.next();
        	funnyOrNot(temp);
        }     
    }
    
    public static void funnyOrNot(String str)
    {
    	String rev = "";
    	int index = str.length()-1;
    	while(index>=0)
    	{
    		rev = rev + (str.charAt(index));
    		index--;
    	}
    	index = 0;
    	boolean flag = true;
    	while(index<str.length()-1)
    	{
    		if(Math.abs(str.charAt(index)-str.charAt(index+1))== 
    			Math.abs(rev.charAt(index)-rev.charAt(index+1)))
    		{
    			index++;
    		}
    		else
    		{
    			flag= false;
    			index++;
    			break;
    		}
    	}
    	if(flag == true)
    		System.out.println("Funny");
    	else
    	{
    		System.out.println("Not Funny");
    		flag = true;
    	}
    }
}
