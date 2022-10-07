package thirdWeekCodes.thirdWeekCodes_38_.overriding;

public class TarimKrediManager extends BaseKrediManager{
    public double hesapla(double tutar){
        System.out.print("  -  Tarim Icin Olusan Faiz Sonucu : " + tutar);
        return tutar * 1.18;

    }
}
