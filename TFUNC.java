import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, hasil;

        n = Integer.parseInt(input.nextLine());
        hasil = pertambahan(n);
        System.out.println("Bilangan yang dimasukkan : " + n);
        System.out.println("Hasil perhitungan rekursif : " + hasil);
    }
    
    public static int pertambahan(int n) {
        int hasil;

        if (n == 1) {
            hasil = 1;
        } else {
            hasil = pertambahan(n - 1) + n;
        }
        
        return hasil;
    }
}
