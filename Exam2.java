import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sladkish = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        int dayOfMonth = Integer.parseInt(scanner.nextLine());

        double cakePrice = 0;
        double soufflePrice = 0;
        double baklavaPrice = 0;
        double totalPrice = 0;

        switch (sladkish){
            case "Cake":
                if (dayOfMonth<=15){
                    cakePrice = 24;
                    totalPrice = cakePrice * quantity;
                }else {
                    cakePrice = 28.70;
                    totalPrice = cakePrice * quantity;
                    break;
                }
            case "Souffle":
               if (dayOfMonth<=15){
                    soufflePrice = 6.66;
                    totalPrice = soufflePrice * quantity;
                    break;

                }else {
                    soufflePrice = 9.80;
                    totalPrice = soufflePrice * quantity;
                    break;
                }
            case "Baklava":
                if (dayOfMonth<=15){
                    baklavaPrice = 12.60;
                    totalPrice = totalPrice * baklavaPrice;

                }else {
                    baklavaPrice = 16.98;
                    totalPrice = totalPrice * baklavaPrice;
                    break;
                }
                if (dayOfMonth<=22 && totalPrice >=100 && totalPrice <200){
                    totalPrice = totalPrice * 0.85;

                }else if (dayOfMonth<=22 && totalPrice>200){
                    totalPrice = totalPrice * 0.75;

                }else if (dayOfMonth<=15){
                    totalPrice = totalPrice * 0.90;

                }
                System.out.println(totalPrice);
        }

    }
}
