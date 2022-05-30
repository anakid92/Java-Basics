import java.util.Scanner;

public class Excursion01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupCount = Integer.parseInt(scanner.nextLine());
        int nightsCount = Integer.parseInt(scanner.nextLine());
        int transportCardsCount = Integer.parseInt(scanner.nextLine());
        int ticketsQuantity = Integer.parseInt(scanner.nextLine());

        double nightPrice = 20;
        double transportPrice = 1.6;
        double ticketPrice = 6;

        double totalPrice = (nightsCount * nightPrice + transportCardsCount * transportPrice + ticketsQuantity * ticketPrice) * groupCount;
        double totalWithDiscount = totalPrice * 1.25;

        System.out.printf("%.2f" , totalWithDiscount);
    }
}
