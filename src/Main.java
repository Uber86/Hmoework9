import javax.xml.stream.XMLInputFactory;

public class Main {
    public static void main(String[] args) {

        // Задача №1
        int [] spending = {11500, 14000, 10985, 21564, 19100};
        int sum = 0;
        for (int i = 0; i < spending.length; i++) {
            sum += spending[i];

        }
        System.out.println("Сумма трат за месяц составила " + sum +  " рублей");

        // Задача № 2
        int maxSpending = -1;
        int minSpending = spending[0];
        for (final int current : spending) {
            if (current > maxSpending) {
                maxSpending = current;
            }
            if (current < minSpending) {
                minSpending = current;
            }
        }
        System.out.print("Минимальная сумма трат за неделю составила " + minSpending +  " рублей.");
        System.out.print("Максимальная сумма трат за неделю составила " + maxSpending + " рублей.");
        System.out.println();

        // Задача № 3
        double sum1 = 0;
        for (int i = 0; i < spending.length; i++) {
            sum1 += spending[i];
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum1 / spending.length + " рублей");

        // Задача № 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1 ; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}