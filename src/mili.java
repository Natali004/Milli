public class mili {
    public static void main(String[] args) {

        int ticketPrice = 5_000; //стоимость билета
        int bonusValue = 20; // стоимость бонуса
        int bonus = ticketPrice / bonusValue;
        System.out.println("Количество бонусов : " + bonus);
    }
}