public class Main {
    public static void main(String[] args) {

        int check = 200;
        int refill = 1200;

        int bonusRubles;

        if (refill > 1000) {
            bonusRubles = refill / 100;
        } else {
            bonusRubles = 0;
        }

        System.out.println("Итоговый счет: " + (check + bonusRubles + refill));
        System.out.println("Зачислено бонусных рублей: " + (bonusRubles));
    }
}
