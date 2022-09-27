package firstWeekCodes_1_23.switchCase;

public class Main {

    public static void main(String[] args) {
        char grade = 'D';

        switch (grade) {
            case 'A':
                System.out.println("Mukemmel : Gectiniz");
                break;
            case 'B':
                System.out.println("Cok Guzel : Gectiniz");
                break;
            case 'C':
                System.out.println("Iyi : Gectiniz");
                break;
            case 'D':
                System.out.println("Fena Degil : Gectiniz");
                break;
            case 'F':
                System.out.println("Maalesef Kaldiniz...");
                break;
            default:
                System.out.println("Gecersiz Not Girdiniz");
        }
    }
}

