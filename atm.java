import java.util.Scanner;

public class atm {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int i=1000,toplam=0,l=3;
            System.out.print("Kullanýcý adý giriniz: ");
            String inp =scanner.nextLine();
            System.out.print("Þifre giriniz: ");
            String tnt =scanner.nextLine();

            if(inp.equals("kerem") && tnt.equals("12345")) {
                System.out.print("Patika bankasýna hoþgeldiniz.\nYapmak istediðiniz iþlem seçiniz\n");
                System.out.println("Para yatýrma için 1, " +
                        "\nPara çekmek için 2,\nBakiye sorgulama için 3,\nÇýkýþ için 4 basýnýz.");

                int a =scanner.nextInt();
                switch (a){
                    case 1:
                        System.out.println("Para miktarý: ");
                        int b=scanner.nextInt();
                        i+=b;
                        System.out.print("Bakiyeniz "+i);break;
                    case 2:
                        System.out.println("Çekme istediðiniz tutar: ");
                        int h=scanner.nextInt();
                        if(h>i){
                            System.out.println("Yetersiz bakiye");
                            break;}
                        else {
                            i -= h;
                            System.out.println("Bakiyeniz: " + i);
                        }break;

                    case 3:
                        System.out.println("Mevcut Bakiyeniz: "+i);break;
                    case 4:
                        System.out.println("Ýyi günler. Yine bekleriz...");break;
                }

            }
            else {
                l--;
                System.out.println("Hatalý kullanýcý veya þifre girdiniz tekrar deneyiniz.");
                if(l==0)
                    System.out.println("Hesabýnýz bloke oldu. Bankayla iletiþime geçiniz.");
            }

    }
}
