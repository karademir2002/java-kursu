public class asal {
    public static void main(String[] args) {
        int number = 7;

        boolean asalMi = true;

        for (int i = 2; i < number; i++) {
           int bolen = i;

            int kalan = number % bolen;

            if (kalan == 0) {
                asalMi = false;
                System.out.println(number+": Asal sayı değil");
                break;
            }

        }
        if (asalMi) {
            System.out.println(number+": Asal sayı");
        }
    }


}


