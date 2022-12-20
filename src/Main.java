public class Main {
    public static void main(String[] args) {

        int moneyInAccount = 100; // Денег было на счете
        System.out.println("Предыдущий остаток на счете: " + moneyInAccount + " руб.");
        int deposit = 1_100;      // Сколько денег кладем на счет
        System.out.println("Вы внесли: " + deposit + " руб.");

        int conditionFor = 1_000;
        boolean condition = deposit >= conditionFor;

        int sum;
        if (condition) {
            sum = moneyInAccount + deposit + deposit / 100;
        } else {
            sum = moneyInAccount + deposit;
        }

        System.out.println("Ваш счет пополнен на: " + sum + " руб.");
    }
}