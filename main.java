import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n,r;
        int rFaktoriyel=1;
        int nFaktoriyel=1;
        int toplamFaktoriyel=1;
        Scanner input = new Scanner(System.in);

        System.out.println("N Elemanlı Kümenin Elemanlarını Yazınız :");
        n = input.nextInt();
        System.out.println("R Elemanlı Kümenin Elemanlarını Yazınız :");
        r = input.nextInt();

        for (int i=1; i<=n; i++){
            nFaktoriyel = nFaktoriyel * i;
        }
        for (int i = 1; i<=r; i++){
            rFaktoriyel = rFaktoriyel * i;
        }
        for (int i = 1; i<=n-r; i++){
            toplamFaktoriyel = toplamFaktoriyel*i;
        }

        int sonuc = nFaktoriyel/(rFaktoriyel*(toplamFaktoriyel));
        System.out.println("Sonuç : " +sonuc);
        }
    }




