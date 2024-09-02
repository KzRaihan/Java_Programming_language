/*Write a function to print the following pattern:
    ****

    ***

    **

    *
      
      */
      public class Reverse_Pattern
      {
          public static void function()
          {
              for(int i=4;i>=1;i--)
              {
                  for(int j=i;j>=1;j--)
                  {
                      System.out.print("*");
                  }
                  System.out.println(" ");
              }
          }
          public static void main(String args[])
          {
            
              function();
              
          }
      }