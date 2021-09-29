import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {

        int result=0;
        System.out.println("Введите любое целое число");
        Scanner scanner = new Scanner(System.in);
        int vvedennoe_chislo = scanner.nextInt();
        while (vvedennoe_chislo > 0) {
           result += (vvedennoe_chislo % 10 );
        vvedennoe_chislo = vvedennoe_chislo/10;
        }
        System.out.println(result);
    }
}
