public class metodlar {
        public static void main(String[] args) {

            mesajVer("harun");
            mesajVer("mami") ;
            hesapla();
            System.out.println(topla(10,15));
            System.out.println(toplananIkiSayininYuzdeOnunuBul(10,106));

        }
        public static void mesajVer(String isim ){
            System.out.println("Merhaba "+isim);
        }

        public static void hesapla(){
            System.out.println("Hesaplandı");
        }

        public static int topla(int sayi1,int sayi2){
            int toplam = sayi1 + sayi2 ;
            return toplam;

        }

        public static double toplananIkiSayininYuzdeOnunuBul(int sayi1,int sayi2){
            int toplam = topla(sayi1,sayi2);
            double sonuc = toplam/10 ;
            return sonuc;

        }







}
