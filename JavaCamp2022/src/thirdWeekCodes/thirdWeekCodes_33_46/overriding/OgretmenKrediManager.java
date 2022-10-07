package thirdWeekCodes.thirdWeekCodes_38_.overriding;

public class OgretmenKrediManager extends BaseKrediManager{
    public double hesapla(double tutar){
        System.out.print("  -  Ogretmen Icin Olusan Faiz Sonucu : " + tutar);

        return tutar * 1.18;

    }
}
