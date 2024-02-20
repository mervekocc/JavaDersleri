import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matematik,fizik,muzik,kimya,turkce;
        int toplam=0;
        int sayac=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println(" Matematik Notunu Giriniz :");
        matematik=scanner.nextInt() ;
        System.out.println("Fizik Notunu Giriniz :");
        fizik=scanner.nextInt() ;
        System.out.println("Muzik Notunu Giriniz :");
        muzik=scanner.nextInt();
        System.out.println("Kimya Notunu Giriniz :");
        kimya=scanner.nextInt();
        System.out.println("Turkce Notunu Giriniz :");
        turkce=scanner.nextInt();

        if (matematik>=0&&matematik<=100){
            toplam+=matematik;
            sayac++;
        }
        if (fizik>=0&&fizik<=100){
            toplam+=fizik;
            sayac++;
        }
        if (muzik>=0&&muzik<=100){
            toplam+=muzik;
            sayac++;
        }
        if (kimya>=0&&kimya<=100){
            toplam+=kimya;
            sayac++;
        }
        if (turkce>=0&&turkce<=100){
            toplam+=turkce;
            sayac++;}
        if((toplam/sayac)>=60){
            System.out.println("Sınıfı Geçti:"+(toplam/sayac));

        }else System.out.println("Sınıfta Kaldı :"+(toplam/sayac));



    }



}