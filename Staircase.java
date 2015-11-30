import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp = n;
        for(int j= 0;j<n;j++)
        {
            for(int i=0;i<temp-1;i++)
            {
                System.out.print(" ");
            }
            for(int k=temp-1;k<n;k++)
                {
                System.out.print("#");
            }
            temp--;
            System.out.println();
        }
        
    }
}
