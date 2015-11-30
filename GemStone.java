import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GemStone 
{
	public static HashMap hp = new HashMap();
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	int num = Integer.parseInt(sc.nextLine()); 	
    	int i=0;
    	while(i<num)
    	{
    		String str = sc.nextLine();
    		checkGem(str);
    		i++;
    	}
    	Set s = hp.entrySet();
    	Iterator iter = s.iterator();
    	int count = 0;
    	while(iter.hasNext())
    	{
    		Map.Entry e = (Map.Entry)iter.next();
    	//	System.out.println("key:"+ e.getKey()+ " value:"+ e.getValue());
    		if((int)e.getValue() == num)
    		{
    			count++;
    		}
    	}
    	System.out.println(count);
    }
    public static void checkGem(String str)
    {
    	int j=0;
    	//System.out.println();
    	//System.out.println();
    	
    	String check = "";
    	while(j<str.length())
    	{
    		char xx = str.charAt(j);
    		//check = check + xx;
    		//System.out.println("char: " + xx);
    		if(hp.containsKey(xx)==false)
    		{
    			hp.put(xx,1);
    			//System.out.println("char: " + xx+ "1st cond");
    			check = check + xx;
    		}
    		else
    		{
    			//System.out.println("char: " + xx+ "2nd cond");
    			if(check.indexOf(xx)== -1)
    			{
    			check = check + xx;
    			int val = (int) hp.get(xx);
    			val++;
    			hp.put(xx, val);
    		//	System.out.println("not dup");
    			}
    		}
    		j++;
    	}
    	//System.out.println("check = " +check);
    }
}
