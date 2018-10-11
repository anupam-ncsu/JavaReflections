package com.anupam.main;

import com.anupam.process.IProcessICD;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //IProcessICD pro = new IProcessICD();
        
        Class cls = IProcessICD.class;
        Class[] proce = IProcessICD.class.getClasses();
        
        System.out.println(proce.length);
    }
}
