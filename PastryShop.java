import java.util.Scanner;

public class PastryShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String order = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        int dayOfMonth = Integer.parseInt(scanner.nextLine());

       double price = 0;
       double totalPrice = 0;
       double afterDiscount = 0;
        switch (order){
            case "Cake":
                if (dayOfMonth <= 15){
                   price = quantity * 24;

                }else{
                    price = quantity * 28.70;
                    break;
            }

            case "Souffle":
                if (dayOfMonth <= 15){
                    price = quantity * 6.66;

                }else {
                    price = quantity * 9.80;
                    break;
                }

            case " Baklava":
                if (dayOfMonth <= 15){
                    price = quantity * 12.60 ;

                }else {
                    price = quantity * 16.98 ;
                    break;
                }

                 totalPrice = price * quantity;

                if (totalPrice>=100 && totalPrice<=200){
                    afterDiscount = totalPrice * 0.15;

                }else if (totalPrice >200){
                    afterDiscount = totalPrice * 0.25;

                }
                if (dayOfMonth<=15){
                    afterDiscount = totalPrice * 0.10;

                }

                System.out.printf("%.2f",  afterDiscount);

        }


    }
}
