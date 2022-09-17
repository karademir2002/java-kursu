public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String ortaMetin = "İlginizi çekebilir";
        String altMetin = "Vade süresi";

        System.out.println(ortaMetin);

        int vade = 12;

        double dolarDun = 18.14;
        double dolarBugun = 18.10;

        boolean dolarDustuMu = true;
        String okYukari = "up.svg";
        String okAsagi = "down.svg";
        String esitlik = "equal.svg";
        if (dolarDun == dolarBugun) {
            System.out.println(esitlik);
            return;
        }

        if (dolarDun < dolarBugun) {
            dolarDustuMu = false;
        }


        if (dolarDustuMu) {
            System.out.println(okAsagi);
        } else if (dolarDustuMu==false) {
            System.out.println(okYukari);

        }

    }
}

