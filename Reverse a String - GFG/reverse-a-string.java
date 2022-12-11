//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        //if str is empty
        if(str==null || str.equals("")){
            return str;
        }
        
        // Reverse the string str
        char[] c= str.toCharArray();
        
        int n= c.length;
        int start=0;
        int end=n-1;
        
        //swapping the first and last element
        while(start<end){
            char temp=c[start];
            c[start]=c[end];
            c[end]=temp;
            start++;
            end--;
        }
        
        //converting array into string and returning it
        return String.copyValueOf(c);
    }
}