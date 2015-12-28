import java.util.Scanner;

public class Profits {

    public static void main(String...args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        while (total != 0){
            int[] profits = new int[total];
            for (int i = 0; i<total; i++) {
                profits[i]=scanner.nextInt();
            }
            int sum = 0;
            int max = -100;
            for (int i = 0; i < profits.length; i++) {
                sum += profits[i];
                if (sum < profits[i]) {
                    sum = profits[i];
                }
                if (sum > max) {
                    max = sum;
                }
            }
            System.out.println(max);
            total = scanner.nextInt();
        }
    }
}
