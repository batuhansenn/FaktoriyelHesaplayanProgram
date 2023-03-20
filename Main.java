import javax.net.ssl.SSLContextSpi;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //n!=1*2*3*..*n
        int islem1 = 1, islem2 = 1, islem3 = 1;
        int sonuc;
        Scanner x = new Scanner(System.in);
        System.out.print("n: ");
        int n = x.nextInt();
        System.out.print("r: ");
        int r = x.nextInt();
        System.out.println(n + " ve " + r + " kombinasyonu");
        for (int i = 1; i <= n; i++) {
            islem1 *= i;
        }
        for (int j = 1; j <= r; j++) {
            islem2 *= j;
        }
        for (int k = 1; k <= (n - r); k++) {
            islem3 *= k;
        }
        sonuc = (islem1) / (islem2 * islem3);
        System.out.println("Sonuç: " + sonuc);
    }
}