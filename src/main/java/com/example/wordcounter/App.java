package com.example.wordcounter;
import java.lang.*;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Word Count Testing App!");
        int a = wordcount("Hello Guys, how are you?");
        System.out.println(a);
    }
    
    public static int wordcount(String s) {
    		int i = 0;
    		String a = s;
    		int num = 0;
    		int l = a.length();
    		char[] b = a.toCharArray();
    		while (i < l ) {
    			if (b[i] == ' ') {
    				num++;
    			}
    			i++;
    		}
        return num + 1;
    }
}
