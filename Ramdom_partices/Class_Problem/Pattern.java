/* Write a program using functions to print the following pattern:
      *

      **

      ***

      ****
      
      */
      public class Pattern
      {
          public static void function(int n)  
          {
              for(int i=1;i<=n;i++) // n = 4 for this problem
              {
                  for(int j=1;j<=i;j++)
                  {
                      System.out.print("*");
                  }
                  System.out.println(" ");
              }
          }
          public static void main(String args[])
          {
              function(4);
              
          }
      }