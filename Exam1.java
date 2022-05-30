import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int bottles = Integer.parseInt(scanner.nextLine());
        int chipsPacket = Integer.parseInt(scanner.nextLine());

        double beerPrice = 1.20 * bottles;
        double chipsPrice = beerPrice * 0.45 * chipsPacket;
        chipsPrice = Math.ceil(chipsPrice);

        double totalSum = beerPrice + chipsPrice;
        double diff = Math.abs(budget-totalSum);

        if (budget>totalSum){
            System.out.printf("%s bought a snack and has %.2f leva left.", name , diff);

        }else if (budget<totalSum){
            System.out.printf("%s needs %.2f more leva!",name ,diff);

        }
    }
}
