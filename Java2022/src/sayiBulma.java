public class sayiBulma {
    public static void main(String[] args){
        int[] sayilar = new int[]{1,2,3,4,5,6,7,8,9,0};
        int sayi=89;
        boolean varMi = false;
        for(int sayi1 : sayilar){
            if(sayi1==sayi){
                varMi= true;
                break;
            }

        }
        if (varMi){
            System.out.println("Sayı Mevcut");
        }
        else{
            System.out.println("Sayı Mevcut Değil");
        }
    }
}
