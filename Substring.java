/*
 * str1
 * str2
 * for(char c : "abcdefghijklmnopqrstuvwxyz".toCharArray())
{
        if(str1.indexOf(c) > -1 && str2.indexOf(c) > -1)
        flag = "YES";
    } 
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Substring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	int num = Integer.parseInt(sc.nextLine());
    	
    	int i=0;
    	while(i<num)
    	{
    		String str1 = sc.nextLine();
    		String str2 = sc.nextLine();
    		i++;
    		checkSubstr(str1,str2);
    	}
    }
    public static void checkSubstr(String s1, String s2)
    {
    	int[] b1= new int[26];
    	int[] b2 = new int[26];
    	
    	for(char c : s1.toCharArray())
    	{
    		b1[(int)c-97]++;
    	}
    	for(char c : s2.toCharArray())
    	{
    		b2[(int)c-97]++;
    	}
    	
    	boolean flag = false;
    	for(int i=0;i<26;i++)
    	{
    		if(b1[i]!= 0 && b2[i]!=0)
    		{
    			if(Math.abs(b1[i]-b2[i])>=0)
    			{
    				flag = true;
    			}
    		}	
    	}
    	if(flag==true)
    	{
    		System.out.println("YES");
    		flag = false;
    	}
    	else
    		System.out.println("NO");
    }
}
