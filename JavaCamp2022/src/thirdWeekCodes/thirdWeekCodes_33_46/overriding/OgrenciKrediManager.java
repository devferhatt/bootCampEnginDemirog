package thirdWeekCodes.thirdWeekCodes_38_.overriding;

public class OgrenciKrediManager extends BaseKrediManager{


    public double hesapla(double tutar){
        System.out.print("  -  Ogrenci Icin Olusan Faiz Sonucu : " + tutar);

        return tutar * 2.0;

    }

}
