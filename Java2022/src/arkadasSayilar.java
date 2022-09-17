public class arkadasSayilar {
    public static void main(String[] args){
        int sayi1=220;
        int sayi2=284;
        int sonuc1=0;
        int sonuc2=0;

        for(int i=1;i<sayi1;i++){

            if(sayi1 % i == 0){
                sonuc1=sonuc1+i;
            }
        }
        for(int j=1;j<sayi2;j++){

            if(sayi2 % j == 0){
                sonuc2=j+sonuc2;
            }
        }
        if(sonuc1==sayi2 || sonuc2==sayi1){
            System.out.println(sayi1+" ve "+sayi2+" " +" arkadaş sayı");
        }
        else {
            System.out.println(sayi1+" ve "+sayi2+" " +" arkadaş sayı değil");
        }

    }
}
