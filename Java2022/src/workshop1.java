public class workshop1 {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int aranacak = 4;

        boolean mevcutMu = sayiBul(sayilar, aranacak);
        mesajVer(mevcutMu, aranacak);
    }

    public static void mesajVer(boolean mevcutMu, int aranacak) {
        String mesaj ;
        if (mevcutMu) {
            mesaj = aranacak + " Mevcut";
            System.out.println(mesaj);
        } else {
            mesaj = aranacak + " Mevcut Değil";
            System.out.println(mesaj);
        }
    }

    public static boolean sayiBul(int[] sayilar, int aranacak) {
        boolean mevcutMu = false;
        for (int sayi : sayilar) {
            if (aranacak == sayi) {
                mevcutMu = true;
                break;
            }
        }
        return mevcutMu;
    }

}
