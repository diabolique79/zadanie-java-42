import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Queue<Integer> list = new PriorityQueue<>();
        Scanner scan = new Scanner(System.in);

        int i = 0;
        int sum = 0;
        Integer number = 0;
        while (i < 5) {

            number = scan.nextInt();
            i++;
            (list).offer(number);

            sum = sum + number;
        }

        for (Integer lista : list) {

            System.out.printf("%s + ", lista);
        }
        System.out.println("");
        System.out.println(sum);

    }
}
