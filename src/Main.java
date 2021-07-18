public class Main {
    public static void main(String[] args) {
        int summa = 1100;
        int balance = 100;
        int bonus;
        if (summa > 1000) {
            bonus = summa / 100;
        } else {
            bonus = 0;
        }
        int amount = balance + summa + bonus;
        System.out.println(amount);
    }
}
