import java.util.Scanner;
import java.io.File;
public class ActivitySelection {
    public static void main (String...args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] array = new int[size][2];
        scanner.nextLine();
        for(int i = 0; i<size; i++) {
            String lineText = scanner.nextLine();
            System.out.println(lineText);
            String[] splitted = lineText.split(" ");
            array[i][0] = Integer.parseInt(splitted[0]);
            array[i][1] = array[i][0] + Integer.parseInt(splitted[1]);
        }
    }
}
