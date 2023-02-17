
package hackerrank;

import java.util.Scanner;


public class StaticInitializerBlock {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        
        int b = read.nextInt();
        int h = read.nextInt();
        
        //1.YOL
       /* try {
            if(b>=0&&h>=0){
                int area = b*h;
                System.out.println("paralelkenar alanı:"+area); 
            }else{
                System.out.println("java.lang.Exception:Breadth and height must be positive");
            }
        } catch (java.lang.Exception e) {
            System.out.println("Breadth and height must be positive");
        }*/
       
       //2.YOL
       if(b>=0&&h>=0){
                int area = b*h;
                System.out.println("paralelkenar alanı:"+area); 
            }else{
                System.out.println("java.lang.Exception:Breadth and height must be positive");
            }
    }
}
