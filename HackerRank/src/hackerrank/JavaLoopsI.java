package hackerrank;



import java.util.Scanner;
/*
 2 ve 20 arasında girilen sayısının 10 a kadar olan değerlerinin çarpımı
*/
public class JavaLoopsI {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        if(N>=2 || N>=20){
            for (int i = 1; i <10 ; i++) {
                System.out.printf("%d * %d = %d \n",N,i,N*i);
            }
    }
}}
