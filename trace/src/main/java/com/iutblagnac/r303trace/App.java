package com.iutblagnac.r303trace;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(hello());
    }
    
    /** Méthode retournant "Hello World!" si exécutée sans paramètre
     * 
     * @return "Hello World!"
     */
    public static String hello() {
        return  "Hello World!" ;
        
    }

    public static String hello(String param) {
        return  param ;
    }
    
}
