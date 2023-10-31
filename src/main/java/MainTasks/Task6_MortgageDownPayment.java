package MainTasks;

public class Task6_MortgageDownPayment {
    public static void main(String[] args) {
        long appartmentPrice = 9000000L;
        double initialPayment = 15.5;
        double downPayment = (appartmentPrice / 100) * initialPayment;
        System.out.println("Стоимость квартиры: " + appartmentPrice + "руб.");
        System.out.println("Процент первоначального взноса: " + initialPayment + "%");
        System.out.println("Сумма первоначального взноса: " + downPayment + "руб.");
    }
}
