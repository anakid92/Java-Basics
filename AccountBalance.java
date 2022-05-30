import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalMoney = 0; //пари в сметката
        String input = scanner.nextLine(); //"NoMoreMoney" или дробни числа под формата на текст
        while (!input.equals("NoMoreMoney")) {
            //input e дробни числа под формата на текст "5.6"
            //сумата
            double sum = Double.parseDouble(input);
            //проверка дали сумата < 0 -> печатаме + break
            if (sum < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            //сума >= 0 -> печатаме + добавяне към сметката
            else {
                System.out.printf("Increase: %.2f%n", sum);
                totalMoney += sum;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Total: %.2f", totalMoney);

    }
}
