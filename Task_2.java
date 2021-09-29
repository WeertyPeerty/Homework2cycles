import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        System.out.println("Введите любое целое число");
        Scanner scanner = new Scanner(System.in);
        int vvedennoe_chislo = scanner.nextInt();
        int a = 0;
        int b = 1;
        while (vvedennoe_chislo > b) {

            System.out.println(a + b);
            a = a + b;
            b = b + a;


        }

    }
}
