
package hackerrank;

import java.util.Scanner;
 /*Task
Given an integer, , perform the following conditional actions:
1<= N <=100
If N is odd, print Weird
If N is even and in the inclusive range of 2 to 5, print Not Weird
If N is even and in the inclusive range of 6 to 20, print Weird
If N is even and greater than 20 , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.
*/
public class HackerRank_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if(N>=1 && N<=100){
            if(N %2==1 ){
                System.out.println("Weird");
            }
            else if(N>=2 && N<=5 && N%2 ==0){
                System.out.println("Not Weird");
                }

            else if (N>=6 && N<=20 && N%2 ==0){
                System.out.println("Weird");
            }
            else if (N>=20 && N%2 ==0){
                System.out.println("Not Weird");
            }
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
    }
 
 
    }
    
}
