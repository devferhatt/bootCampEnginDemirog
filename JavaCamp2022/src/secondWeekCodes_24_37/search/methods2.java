package search;

public class methods2 {

    public static void main(String[] args) {
        String mesaj = "Bugun hava cok guzel";
        String yeniMesaj = mesaj.substring(0,2);
        System.out.println(yeniMesaj);
        System.out.println(topla());
        System.out.println(sehirVer());
        int toplam = topla2(2,3,4,7,3,9,35);
        System.out.println(toplam);


    }
    public static void ekle (){
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silinfi");
    }
    public static void guncelle(){
        System.out.println("Guncellendi");
    }
    public static int topla(){
        return 5;
    }

    public static int topla2(int... sayilar){
        int toplam = 0;
        for(int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
    public static String sehirVer(){
        return "ankara";
    }

}
