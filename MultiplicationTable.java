import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //първи множител -> 1 до 10
        //втори множител -> 1 до 10
        //за всяка стойност на 1 множител -> повтаря се: всяка стойност на втория множител
        for (int first = 1; first <= 10; first++) {
            for (int second = 1; second <= 10; second++) {
                int product = first * second;
                System.out.println(first + " * " + second + " = " + product);
            }
        }
    }
}
