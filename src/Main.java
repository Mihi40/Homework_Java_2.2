// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int amount;
        int pay;
        int bonus;
        int sum;
        pay = 1100;
        amount = 100;
        if (pay > 1000) {
            bonus = pay / 100;
            sum = bonus + pay + amount;
        } else {
            bonus = 0;
            sum = pay + amount;
        }
        System.out.println("Итоговая сумма равна " + sum + " рублей ");
        System.out.println("Бонусы " + bonus + " рублей ");
    }
}