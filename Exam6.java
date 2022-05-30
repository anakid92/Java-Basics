import java.util.Scanner;

public class Exam6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int videoPrice = Integer.parseInt(scanner.nextLine());
        int prehodnikPrice = Integer.parseInt(scanner.nextLine());
        double elecricityPerDAY = Double.parseDouble(scanner.nextLine());
        double winPerDay = Double.parseDouble(scanner.nextLine());

        int totalExpenses = (videoPrice * 13) + (prehodnikPrice * 13) + 1000;
        double singleCardWinPerDay = winPerDay - elecricityPerDAY;
        double totalWin = 13 * singleCardWinPerDay;
        double daysForInvest = totalExpenses / totalWin;
        daysForInvest = (Math.ceil(daysForInvest));

        System.out.println(totalExpenses);
        System.out.printf("%.0f", daysForInvest);


    }
}

