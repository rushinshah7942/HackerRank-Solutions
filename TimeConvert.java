import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConvert {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        
        String[] time_12 = time.split(":");
        int hour = Integer.parseInt(time_12[0]);        
        int min = Integer.parseInt(time_12[1]);
        String str = time.substring(8, 10);
        String last[] = time_12[2].split(str);
        int sec = Integer.parseInt(last[0]);
        
        DecimalFormat df = new DecimalFormat("00");
        
        //System.out.println(df.format(hour)+ " " + df.format(min) +" " + df.format(sec) + " what? = "+ time_12[2].substring(2, 4));
         
        if((time_12[2].substring(2, 4)).equals("PM") && hour<12)
        	{
        	//System.out.println("comes here");
        		hour = hour + 12;
        	}
        else if((time_12[2].substring(2, 4)).equals("AM") && hour == 12)
		{
        	hour = 00;
		}
        
        System.out.println(df.format(hour) + ":" + df.format(min) + ":" + df.format(sec));
    }
}
