/* Write a recursive function to calculate the sum of first n natural numbers.
1 + 2 + 3 + 4 + 5 + .......+ n-1 + n.
*/
public class Recursive_sum_num {
 static int Recursive_sum(int n)
          {
              if(n==1)
              {
                  return 1;
              }
              return n + Recursive_sum(n-1);
              
              
          }
         
          public static void main(String args[])
          {
              int result = Recursive_sum(4); // this problem  n = 4( 1 + 2 + 3 + 4 ) || = 10
              System.out.println("Result: "+result); // 10
          }
    
}
