import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int leftSum = 0;
        int rightSum =0;

        for (int i = 1; i <=n ; i++) {
            int leftNumber = Integer.parseInt(scanner.nextLine());
            leftSum += leftNumber;

        }
        for (int i = 1; i <=n ; i++) {
            int rightNumber = Integer.parseInt(scanner.nextLine());
            rightSum += rightNumber;

        }

        if (leftSum == rightSum){
            System.out.println("Yes, sum = " + leftSum);

        }else {
            int diff = Math.abs(leftSum - rightSum);
            System.out.println("No, diff = " + diff);

        }


    }

}
