public class Main {
    public static void main(String[] args) {

        int deposit = 1_100;  // Сколько денег кладем на счет
        System.out.println("Вы внесли: " + deposit + " руб.");

        int cond = 1_000;
        boolean c = deposit >= cond;

        int sum;
        if (c) {
            sum = deposit + deposit/100;
        }
        else {
            sum = deposit;
        }

        System.out.println("Ваш счет пополнен на: " + sum);
    }
}