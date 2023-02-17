
import java.util.Scanner;


public class EndOfFile {
    /*
    Buradaki zorluk, EOF'ye ulaşana kadar N satırlık girdiyi okumak, ardından tüm N satırlık içeriği numaralandırmak ve yazdırmaktır.
    
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for(int i=1;sc.hasNext()==true;i++){
            System.out.println(i+" "+sc.nextLine());
        }
    }
}

