import java.util.Scanner;

public class atm {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int i=1000,toplam=0,l=3;
            System.out.print("Kullan�c� ad� giriniz: ");
            String inp =scanner.nextLine();
            System.out.print("�ifre giriniz: ");
            String tnt =scanner.nextLine();

            if(inp.equals("kerem") && tnt.equals("12345")) {
                System.out.print("Patika bankas�na ho�geldiniz.\nYapmak istedi�iniz i�lem se�iniz\n");
                System.out.println("Para yat�rma i�in 1, " +
                        "\nPara �ekmek i�in 2,\nBakiye sorgulama i�in 3,\n��k�� i�in 4 bas�n�z.");

                int a =scanner.nextInt();
                switch (a){
                    case 1:
                        System.out.println("Para miktar�: ");
                        int b=scanner.nextInt();
                        i+=b;
                        System.out.print("Bakiyeniz "+i);break;
                    case 2:
                        System.out.println("�ekme istedi�iniz tutar: ");
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
                        System.out.println("�yi g�nler. Yine bekleriz...");break;
                }

            }
            else {
                l--;
                System.out.println("Hatal� kullan�c� veya �ifre girdiniz tekrar deneyiniz.");
                if(l==0)
                    System.out.println("Hesab�n�z bloke oldu. Bankayla ileti�ime ge�iniz.");
            }

    }
}
