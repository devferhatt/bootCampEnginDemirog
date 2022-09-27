package search;

public class aranacak {

    public static void main(String[] args) {

        sayiBulma();

    }

    public static void sayiBulma(){
        int [] sayilar = new int[] {1,2,3,4,5,6,7};
        int aranacak = 6;
        boolean varMi = false;

        for (int sayi : sayilar){
            if(sayi==aranacak){
                varMi = true;
                break;
            }
        }
        if(varMi)
            mesajVer(aranacak);
        else {
            mesajVerr(aranacak);
        }
    }
    public static void mesajVer(int aranacak){
        System.out.println("Sayi mevcuttur : " + aranacak);
    }
    public static void mesajVerr(int aranacak){
        System.out.println("Sayi mevcut degil : " + aranacak);
    }

}
