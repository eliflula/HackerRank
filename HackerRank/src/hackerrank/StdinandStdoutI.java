
package hackerrank;

import java.util.Scanner;


public class StdinandStdoutI {
    /*
By default, the next() method creates a new token each time it sees whitespace.
The character that triggers tokenization is known as a delimiter
The nextLine() method returns all text up to a line break.
The next() method returns tokenized text.
The next() method uses whitespace as the default delimiter.
You can change the delimiter of the next() method to any valid String.
*/
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        scan.nextLine();//The nextLine() method returns all text up to a line break.
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
    
