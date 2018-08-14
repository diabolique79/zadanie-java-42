import java.util.*;

public class Main {

    public static void main(String[] args) {

        Queue<Integer> list = new LinkedList<>();
        Scanner scan = new Scanner(System.in);

        int i = 0;
        int sum = 0;
        Integer number = 0;
        System.out.println("Wprowadź 10 wartości liczbowych unikalnych: ");
        while (i < 10) {

            number = scan.nextInt();
            i++;
            (list).offer(number);

            sum = sum + number;
        }

        for (Integer lista : list) {
            if(((LinkedList<Integer>) list).getLast()==lista){

                System.out.print(lista + " = ");
            }
            else
            System.out.printf("%s + ", lista);
        }
        System.out.println(sum);

    }
}
