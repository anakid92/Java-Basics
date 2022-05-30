import java.util.Scanner;

public class Excursion05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seaQuantity = Integer.parseInt(scanner.nextLine());
        int mountainQuantity = Integer.parseInt(scanner.nextLine());


        int totalWin = 0;
        String input = scanner.nextLine();
        while (!input.equals("Stop")) {


            if (input.equals("sea") && seaQuantity > 0) {
                totalWin = 680 + totalWin;
                seaQuantity--;


            } else if (input.equals("mountain") && mountainQuantity > 0) {
                totalWin = 499 + totalWin;
                mountainQuantity--;


            }
            if (seaQuantity == 0 && mountainQuantity == 0) {
                break;

            }


            input = scanner.nextLine();


        }
            if (input.equals("Stop")){
                System.out.printf("Profit : %d leva.", totalWin);


        } else
        System.out.printf("Good job! Everything is sold.%n" +
                "Profit: %d leva.", totalWin);



        }
    }
