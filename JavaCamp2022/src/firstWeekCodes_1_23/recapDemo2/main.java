package firstWeekCodes_1_23.recapDemo2;

public class main {
        public static void main(String[] args) {
            double[] myList = {1.2, 1.6, 4.3, 5.7, 3.7};
            double total = 0;

            double max = myList[0];
            for (double number:myList){
                if(max<number)
                    max = number;
                total = total + number;
                System.out.println(number);
            }

            System.out.println("Toplam : " + total);
            System.out.println("En Buyuk : " + max);




        }
}

