import java.util.Scanner;

public class BraceletStand02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pocketMoney = Double.parseDouble(scanner.nextLine());
        double winPerDay = Double.parseDouble(scanner.nextLine());
        double expenses = Double.parseDouble(scanner.nextLine());
        double presentPrice = Double.parseDouble(scanner.nextLine());

        double totalSaves = (pocketMoney + winPerDay) * 5;
        double total = totalSaves - expenses;

        if (total>=presentPrice){
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", total);

        }else{
            double diff = Math.abs(total - presentPrice);

            System.out.printf("Insufficient money: %.2f BGN.", diff);

        }

    }
}
