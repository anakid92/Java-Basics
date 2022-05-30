import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int S = Integer.parseInt(scanner.nextLine());


        for (int i = M; i >=N ; i--) {
            if (i % 2 == 0 && i % 3 == 0 && i != S){
                System.out.print(i + " ");


            }else if (i == S){
                return;

            }

        }

    }
}