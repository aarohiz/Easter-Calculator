
/**DESCRIPTION:
 *  Determines what day Easter falls on. Can be used for any date in the Gregorian calendar from 1583 
 *  to any date after.
 *  Lab 3.2
 *  
 *  PURPOSE:
 *  We learn how to assign values for identifiers and variables and use them to plug things 
 *  into algorithms. The algorithms use mathematical operators like division and modulus to get 
 *  remainders and quotients.
 *  
 *  
 * 
 * @author Created by Aarohi Zade 
 * @version September 7th 2017
 */
import chn.util.*; //imports ConsoleIO

public class Easter
{
   public static void main(String[]args)
   {
      int y; //declares y as type int
      int a; //declares a as type int
      int b; //declares b as type int
      int c; //declares c as type int
      int d; //declares d as type int
      int e; //declares e as type int
      int f; //declares f as type int
      int g; //declares g as type int
      int h; //declares h as type int
      int i; //declares i as type int
      int k; //declares k as type int
      int r; //declares r as type int
      int m; //declares m as type int
      int n; //declares n as type int
      int p; //declares p as type int
      y = 2017; //sets value of y as 2017
      a = y/19; // sets value of a as y divided by 2017
      b = y/100; // sets value of b as y divided by 100
      c = (y%100); // sets value of c as y modulus 100
      d = b/4; //sets value of d as b divided by 4
      e = (b%4); //sets value of e as b divided by 4
      f = (b+8)/25; //sets value of f as (b+8)/25
      g = (b - f + 1)/3; //sets value of g as (b - f + 1)/3
      h = ((19 * a + b - d - g + 15)% 30); //sets value of h as ((19 * a + b - d - g + 15)% 30)
      i = (c / 4); //sets value of i as (c / 4)
      k = (c%4); //sets value of k as (c%4)
      r = ((32 + 2 * e + 2 * i - h - k)/ 7); //sets value of r as ((32 + 2 * e + 2 * i - h - k)/ 7)
      m = (a + 11 * h + 22 * r)/451; //sets value of m as (a + 11 * h + 22 * r)/451
      n = (h + r - 7 * m +114)/31; //sets value of n as (h + r - 7 * m +114)/31
      p = ((h + r - 7 * m +114)%31); //sets value of p as ((h + r - 7 * m +114)%31)
      

      System.out.println("Easter falls on " + (n) + "/" + (p+1) + "/" + y); //prints easter day, month and year
      
      
      
      
      
      
      
      
      
       
       
}
}