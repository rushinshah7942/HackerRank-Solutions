import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Panagram {

    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	String str = sc.nextLine();
    	str = str.toLowerCase();
    	boolean[] b = new boolean[26]; // by default "false"
    	int index=0;
    	while(index<str.length())
    	{
    		int temp = (int)str.charAt(index);
    		if((temp<=90 && temp>=65) || (temp>=97 && temp<=122))
    		{
    			b[temp-97] = true;
    			
    		}
    		index++;
    	}
    	
    	boolean flag = true;
    	for(int i=0;i<26;i++)
    	{
    		if(b[i]!=true)
    			flag = false;
    	}
    	if(flag==true)
    		System.out.println("pangram");
    	else
    		System.out.println("not pangram");
    	
    	
    }
}
