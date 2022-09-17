public class mukemmelSayi {
    public static void main(String[] args) {

        for (int sayi = 1; sayi < 1000; sayi++) {
            int bolen = 1;
            int mukemmelMi = 0;

            for (int i = 1; i < sayi; i++) {
                bolen = i;
                int kalan = sayi % bolen;
                if (kalan == 0) {
                    mukemmelMi = i + mukemmelMi;
                }
            }
            if (mukemmelMi == sayi) {
                System.out.println(sayi + ": Mükemmel sayı");
            }
            else {
                System.out.println(sayi+": Mükemmel sayı değil");
            }
        }
    }

}