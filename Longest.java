package Longest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Longest {

    /**
     * @param args the command line arguments
     */
public static String LongestCommonPrefix(String[] strs) 
		{
    		if(strs==null || strs.length==0)
    		{
        		return "";
    		}
 
    		if(strs.length==1) 
        		return strs[0];
 
            int minLen = Integer.MAX_VALUE;

    		for(String str: strs)
    		{
        		if(minLen > str.length())
        		{
            		minLen = str.length();
        		}
    		}
 
    		for(int i=0; i<minLen; i++)
    		{
        		for(int j=0; j<strs.length-1; j++)
        		{
            		String s1 = strs[j];
            		String s2 = strs[j+1];
            		if(s1.charAt(i)!=s2.charAt(i))
            		{
                		return s1.substring(0, i);
                        //System.out.println("check\n");
            		}
        		}
    		}
 
	    	return strs[0].substring(0, minLen);
		}	

	public static void main(String[] args) throws IOException
	{
        char choice;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Input  Values(yes/no): ");
        choice = (char)bf.read();
        
        if(choice != 'y')
        {
            bf = new BufferedReader(new InputStreamReader(System.in));    
            String[] array = bf.readLine().split("\\s");
            System.out.println(LongestCommonPrefix(array));                
        }
        else
        {
            String[] array = {"foo","foobar","foobarfoo","foobarbar"}; 
            System.out.println(LongestCommonPrefix(array));
        }            
	}
}