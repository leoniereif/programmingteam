import java.util.Scanner;

public class Balloons {

    public static void main(String...args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] array = new int[n][3];
        for(int i = 0; i<n; i++) {
            int k = scanner.nextInt();
            int toa = scanner.nextInt();
            int tob = scanner.nextInt();
            array[i][0]=k*toa;
            array[i][1]=k*tob;
            array[i][2]=k;
        }
        int sum = 0;
        for(int i = 0; i<n; i++) {
            if(array[i][0]<array[i][0]) {
                sum += array[i][0];
            } else {
                sum += array[i][1];
            }
        }
        System.out.println(sum);
    }
}
